package com.unip.aps.resource;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.unip.aps.controller.Controller;
import com.unip.aps.entity.PessoaEntity;


@Path("/async")
public class Integration {
	
	Controller c = new Controller();
	private PessoaEntity pessoa = new PessoaEntity();
	
	
	@GET
	@Path("/ping")
	@Produces(value = "application/json")
	public Response getStatus() {
		return Response.ok().status(Response.Status.OK).entity("{\"retorno\":\"pong\"}").build();
	}
	
	
	  @POST
	   @Path("/inserir")
	   @Produces("application/json")
	   @Consumes("application/json")
	   public Response ja(String json){
	        try {
	        	
	        	Gson gson = new Gson();
		        gson.toJson(json);
		        pessoa = gson.fromJson(json, PessoaEntity.class);
		        UUID uuid = UUID.randomUUID();
		        pessoa.setUUID(uuid.toString());
	        	int retorno = c.enviar(pessoa);
	        	String suport = String.valueOf(retorno);
	        	return Response.ok().status(Response.Status.OK).entity("Valor Total:" + suport).build();
	        } catch (Exception ex) {
	        	return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).entity("{\"retorno\":\"Deu ruim\"}").build();
	    }


}
	  
}
