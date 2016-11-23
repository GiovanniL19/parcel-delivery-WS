import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by giovannilenguito on 23/11/2016.
 */
@Path("/drivers")
public class Driver {

    @GET
    @Produces({MediaType.TEXT_HTML})
    public String drivers() {
        return "<html>" +
                "<h4>The endpoints are as follows:</h4>" +
                "/byUsername/{username} (must pass String)<br>" +
                "/byID/{id} (must pass an int)<br>" +
                "/all (requires no parameters)" +
                "</html>";
    }

    @GET
    @Path("/byUsername/{username}")
    @Produces("application/json")
    public Response getDriver(@PathParam("username") String username) throws JSONException {
        if (username.equalsIgnoreCase("GiovanniL")) {

            //HARD CODE JSON OBJECT
            JSONObject address = new JSONObject();
            address.put("lineOne", "2 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            JSONObject user = new JSONObject();
            user.put("id", "1");
            user.put("type", "Driver");
            user.put("username", "GiovanniL");
            user.put("password", "123");
            user.put("email", "gio@email.com");
            user.put("fullName", "Giovanni Lenguito");
            user.put("contactNumber", "01234567890");
            user.put("address", address);

            return Response.ok(user.toString(), MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Driver not found").build();
        }
    }


    @GET
    @Path("/byID/{id}")
    @Produces("application/json")
    public Response getDriverByID(@PathParam("id") String id) throws JSONException {
        if (id.equalsIgnoreCase("1")) {

            //HARD CODE JSON OBJECT
            JSONObject address = new JSONObject();
            address.put("lineOne", "2 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            JSONObject user = new JSONObject();
            user.put("id", "1");
            user.put("type", "Driver");
            user.put("username", "GiovanniL");
            user.put("password", "123");
            user.put("email", "gio@email.com");
            user.put("fullName", "Giovanni Lenguito");
            user.put("contactNumber", "01234567890");
            user.put("address", address);

            return Response.ok(user.toString(), MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Driver not found").build();
        }
    }

    @GET
    @Path("/all")
    @Produces("application/json")
    public Response getAllCustomers() throws JSONException {
        JSONArray users = new JSONArray();

        //HARD CODE JSON OBJECT
        JSONObject address = new JSONObject();
        address.put("lineOne", "2 Close");
        address.put("lineTwo", "");
        address.put("city", "London");
        address.put("postcode", "L0 2DO");
        address.put("country", "United Kingdom");

        JSONObject user = new JSONObject();
        user.put("id", "1");
        user.put("type", "Driver");
        user.put("username", "GiovanniL");
        user.put("password", "123");
        user.put("email", "gio@email.com");
        user.put("fullName", "Giovanni Lenguito");
        user.put("contactNumber", "01234567890");
        user.put("address", address);


        users.put(user);

        if(users.length() > 0){
            return Response.ok(user.toString(), MediaType.APPLICATION_JSON).build();
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Customers not found").build();
        }
    }
}
