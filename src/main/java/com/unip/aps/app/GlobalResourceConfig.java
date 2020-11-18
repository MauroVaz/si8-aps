package com.unip.aps.app;


	

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api/v1/*")
public class GlobalResourceConfig extends ResourceConfig{	
	    
	    public GlobalResourceConfig() {
	    	packages("com.unip.aps.resource","io.swagger.jaxrs.listing");	    	
	    	
	    }
	    
}


