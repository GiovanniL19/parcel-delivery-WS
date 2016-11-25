import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by giovannilenguito on 24/11/2016.
 */
@Path("/locations")
public class Location {
    @DELETE
    @Path("/delete/{id}")
    @Produces("application/json")
    public Response deleteLocation(@PathParam("id") String id) throws JSONException {
        System.out.println("DELETE LOCATION BY ID OF " + id);
        return Response.ok("Location Deleted", MediaType.APPLICATION_JSON).build();
    }

    @PUT
    @Path("/update")
    @Produces("application/json")
    @Consumes("application/json")
    public Response updateLocation(String location) throws JSONException {
        System.out.println("UPDATED");
        System.out.println(location);
        return Response.ok("Location Updated", MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Path("/new")
    @Produces("application/json")
    @Consumes("application/json")
    public Response newLocation(String location) throws JSONException {
        System.out.println("CREATED");
        System.out.println(location);
        return Response.ok("Location Created", MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/byParcelId/{id}")
    @Produces("application/json")
    public Response getLocationByParcel(@PathParam("id") String id) throws JSONException {
        if(id.equals("0")) {
            JSONObject location = new JSONObject();
            location.put("longitude" ,"53.0160257");
            location.put("latitude", "-2.1792232");
            location.put("parcelID", "0");
            location.put("locationID", "0");
            return Response.ok(location.toString(), MediaType.APPLICATION_JSON).build();
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Location not found with id of " + id).build();
        }
    }
}
