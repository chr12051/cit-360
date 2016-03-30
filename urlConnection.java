package com.hanselandpetal.catalog;

import java.io.BufferedReader;


public class HttpManager {

	public static String getData(String uri) {
	
		BufferedReader reader = null;
		
		try {
			URL url = new URL(uri);
			HttpURLConnection con = url.openConnection();
			
			StringBuilder sb =  new StringBuilder();
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line;
			while ((line = reader.readline()) != null) {
				sb.append(line + "\n");
			}
				
			return sb.toString();	
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (reader !=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
					return null;
		}
	
}
