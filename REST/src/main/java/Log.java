import org.codehaus.jettison.json.JSONException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by giovannilenguito on 24/11/2016.
 */
@Path("/logs")
public class Log {
    @POST
    @Path("/new")
    @Produces("application/json")
    @Consumes("application/json")
    public Response newLog(String log) throws JSONException {
        System.out.println(log);
        //create log for user from username
        return Response.ok("Log Created", MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/all")
    @Produces("application/json")
    public Response allLogs() throws JSONException {
        //create log for user from username
        return Response.ok("Log Created", MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/byId/{id}")
    @Produces("application/json")
    public Response getLogById(@PathParam("id") String id) throws JSONException {
        //create log for user from username
        return Response.ok("Log Created", MediaType.APPLICATION_JSON).build();
    }
}
