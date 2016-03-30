package com.hanselandpetal.catalog;

import java.io.BufferedReader;


public class HttpManager {

	public static String getData(String uri) {
	
	
		AndroidHttpClient client = AndroidHttpClient.newInstance("AndroidAgent");
		HttpGet request = new HttpGet(uri);
		HttpResponse response;
		
		try {
			response = client.execute(request);
			return EntityUtils.toString(respnse.getEntity());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			client.close();
		}
	
	}

}
