package com.local.rest;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/message")
public class EndPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response printMessage(Document msg) {

        String result = Integer.toString( msg.value) +
                " Restful example : " + msg.name;

        return Response.status(200).entity(result).build();

    }

}
