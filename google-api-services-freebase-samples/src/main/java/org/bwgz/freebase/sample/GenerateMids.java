package org.bwgz.freebase.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.freebase.Freebase;

public class GenerateMids {
	static private final String applicationName = GenerateMids.class.getName();
	static private final String[] queries =  new String[] {
		"[{\"type\":\"/media_common/quotation\",\"mid\":null}]",
		"[{\"type\": \"/people/person\",\"mid\":  null,\"name\": null,\"/people/person/quotations\": [{\"mid\":  null,\"name\": null}]}]",
		"[{	\"type\": \"/media_common/quotation_subject\",\"mid\": null,\"name\": null}]",							
	};
						
	public static List<String> generate(Freebase freebase, String query) throws IOException {
        System.out.printf("***** GenerateMids (%s)\n", query);
         List<String> mids = new ArrayList<String>();
       
        Object cursor = "";
        int offset = 0;
        
        while (cursor instanceof String && offset < Integer.MAX_VALUE) {
		    try {
		        Freebase.Mqlread mqlRead = freebase.mqlread(query);
		        mqlRead.setKey("AIzaSyBUSPKs6JsRUbMub3uIKZh6ftX8SWwJK0Y");
		        mqlRead.setCursor((String) cursor);
		        GenericJson response = mqlRead.execute();
		        
		        //System.out.println(response.toPrettyString());
		        
				List<Map<String, ?>> result = (List<Map<String, ?>>) response.get("result");
				for (Map<String, ?> item : result) {
					mids.add(((String) item.get("mid")).substring(3));
				}
				
		        cursor = response.get("cursor");
		        offset += result.size();
		        System.out.println(String.format("offset: %7d  cursor: %s", offset, cursor));
		    } catch (Exception e) {
		        e.printStackTrace();
		    } 
        }
        
		JsonFactory jsonFactory = new JacksonFactory();
		System.out.println(jsonFactory.toPrettyString(mids));

        System.out.println("******************************");
        
        return mids;
	}


	private static void generate(Freebase freebase, String query, String file) throws IOException {
	
		List<String> mids = generate(freebase, query);
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
        
        for (String mid : mids) {
            out.write(mid);
            out.newLine();
        }
        
        out.close();
	}

	public static void main(String[] args) {
		
	    HttpTransport httpTransport = new NetHttpTransport();
	    JsonFactory jsonFactory = new JacksonFactory();
	    HttpRequestInitializer httpRequestInitializer = new HttpRequestInitializer() {

			@Override
			public void initialize(HttpRequest request) throws IOException {
			}
	    };
	    
	    Freebase.Builder fbb = new  Freebase.Builder(httpTransport, jsonFactory, httpRequestInitializer);
	    fbb.setApplicationName(applicationName);
	    Freebase freebase = fbb.build();
	    
	    try {
			generate(freebase, queries[0], "quotations.mids");
			generate(freebase, queries[1], "authors.mids");
			generate(freebase, queries[2], "subjects.mids");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
