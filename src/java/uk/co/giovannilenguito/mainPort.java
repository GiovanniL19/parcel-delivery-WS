/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author giovannilenguito
 */
@Path("mainport")
public class mainPort {

    private uk.co.giovannilenguito_client.Main port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of mainPort
     */
    public mainPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method getUsers
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("getusers/")
    public String getUsers() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.getUsers();
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private uk.co.giovannilenguito_client.Main getPort() {
        try {
            // Call Web Service Operation
            uk.co.giovannilenguito_client.Main_Service service = new uk.co.giovannilenguito_client.Main_Service();
            uk.co.giovannilenguito_client.Main p = service.getMainPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
