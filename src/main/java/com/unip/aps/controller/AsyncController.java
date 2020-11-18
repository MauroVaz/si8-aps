package com.unip.aps.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.unip.aps.entity.PessoaEntity;

public class AsyncController implements Runnable  {
	
	private String newJson ;
	
	public AsyncController(String newJson)  {
		try{
			this.newJson = newJson;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void run() {
		
		try {
			
			
	        System.out.println(newJson);
			  URL url = new URL("http://localhost:8080/aps-si8-calculo/api/v1/calculo/calcular/");
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();            
				connection.addRequestProperty("Request-Method","POST");      
				connection.setRequestProperty("Content-Type", "application/json");
				    
				 
				connection.setDoInput(true);    
				connection.setDoOutput(true);    
				OutputStream os = connection.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");    
				osw.write(newJson);
				osw.flush();
				osw.close();
				os.close();
				connection.connect();    
				    
				if(connection.getResponseCode() == HttpURLConnection.HTTP_ACCEPTED) {    
				    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));    
				    StringBuffer newData = new StringBuffer(10000);    
				    String s = "";    
				    while (null != ((s = br.readLine()))) {    
				        newData.append(s);    
				    }    
				    br.close();    
				    System.out.println(new String(newData));    
				} 	
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}

}
