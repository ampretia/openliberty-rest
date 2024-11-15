package io.openliberty.guides.rest;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class SystemApplication extends Application {
    @Path("/ping")
    @GET
    public String ping(){
        return "pong";
    }
}
