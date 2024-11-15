package io.openliberty.guides.rest;

import org.example.utilities.StringProcess;
import org.example.utilities.StringUtils;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/stringprocess")
public class StringProcessResource {
    
    @Path("/convert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public StringProcess convert(StringProcess process){
       
        // pass to the library to process
        return StringUtils.process(process);

        
    }

    @Path("/ping")
    @GET
    public String ping(){
        return "pong";
    }
}
