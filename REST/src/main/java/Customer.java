import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by giovannilenguito on 23/11/2016.
 */
@Path("/customers")
public class Customer {

    @GET
    @Produces({MediaType.TEXT_HTML})
    public String customers() {
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
    public Response getCustomer(@PathParam("username") String username) throws JSONException {
        if (username.equalsIgnoreCase("CharlotteD")) {

            //HARD CODE JSON OBJECT
            JSONObject address = new JSONObject();
            address.put("lineOne", "1 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            JSONObject user = new JSONObject();
            user.put("id", "2");
            user.put("type", "Customer");
            user.put("username", "CharlotteD");
            user.put("password", "123");
            user.put("email", "char@email.com");
            user.put("fullName", "Charlotte Dickinson");
            user.put("contactNumber", "01234567890");
            user.put("address", address);

            System.out.println("Got Customer by username");
            return Response.ok(user.toString(), MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Customers not found").build();
        }
    }


    @GET
    @Path("/byID/{id}")
    @Produces("application/json")
    public Response getCustomerByID(@PathParam("id") String id) throws JSONException {
        if (id.equalsIgnoreCase("2")) {

            //HARD CODE JSON OBJECT
            JSONObject address = new JSONObject();
            address.put("lineOne", "1 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            JSONObject user = new JSONObject();
            user.put("id", "2");
            user.put("type", "Customer");
            user.put("username", "CharlotteL");
            user.put("password", "123");
            user.put("email", "char@email.com");
            user.put("fullName", "Charlotte Lenguito");
            user.put("contactNumber", "01234567890");
            user.put("address", address);

            System.out.println("Got Customer by id");
            return Response.ok(user.toString(), MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Customers not found").build();
        }
    }

    @GET
    @Path("/all")
    @Produces("application/json")
    public Response getAllCustomers() throws JSONException {
        JSONArray users = new JSONArray();

        //HARD CODE JSON OBJECT
        JSONObject address = new JSONObject();
        address.put("lineOne", "1 Close");
        address.put("lineTwo", "");
        address.put("city", "London");
        address.put("postcode", "L0 2DO");
        address.put("country", "United Kingdom");

        JSONObject user = new JSONObject();
        user.put("id", "2");
        user.put("type", "Customer");
        user.put("username", "CharlotteD");
        user.put("password", "123");
        user.put("email", "char@email.com");
        user.put("fullName", "Charlotte Dickinson");
        user.put("contactNumber", "01234567890");
        user.put("address", address);

        users.put(user);

        //HARD CODE JSON OBJECT
        JSONObject address2 = new JSONObject();
        address2.put("lineOne", "32 Street");
        address2.put("lineTwo", "");
        address2.put("city", "Stoke");
        address2.put("postcode", "ST1 2NE");
        address2.put("country", "United Kingdom");

        JSONObject user2 = new JSONObject();
        user2.put("id", "3");
        user2.put("type", "Customer");
        user2.put("username", "TestUser");
        user2.put("password", "123");
        user2.put("email", "test@email.com");
        user2.put("fullName", "John Smith");
        user2.put("contactNumber", "01234567890");
        user2.put("address", address2);

        users.put(user2);

        if(users.length() > 0){
            System.out.println("Got all Customers");
            return Response.ok(users.toString(), MediaType.APPLICATION_JSON).build();
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Customers not found").build();
        }
    }
}
