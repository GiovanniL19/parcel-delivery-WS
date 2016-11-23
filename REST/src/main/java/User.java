import com.google.gson.Gson;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.UUID;

/**
 * Created by giovannilenguito on 23/11/2016.
 */
@Path("/users")
public class User {

    @POST
    @Path("/new")
    @Produces("application/json")
    public Response postDriver(String driver) throws JSONException {
        try {
            Map jsonMap = new Gson().fromJson(driver, Map.class);

            String id = String.valueOf(UUID.randomUUID());
            String type = jsonMap.get("type").toString();
            String username = jsonMap.get("username").toString();
            String password = jsonMap.get("password").toString();
            String email = jsonMap.get("email").toString();
            String fullName = jsonMap.get("fullName").toString();
            String contactNumber = jsonMap.get("contactNumber").toString();


            Map address = (Map) jsonMap.get("address");
            String lineOne = address.get("lineOne").toString();
            String lineTwo = address.get("lineTwo").toString();
            String city = address.get("city").toString();
            String postcode = address.get("postcode").toString();
            String country = address.get("country").toString();


            JSONObject addressJ = new JSONObject();
            addressJ.put("lineOne", lineOne);
            addressJ.put("lineTwo", lineTwo);
            addressJ.put("city", city);
            addressJ.put("postcode", postcode);
            addressJ.put("country", country);

            JSONObject user = new JSONObject();
            user.put("id", id);
            user.put("type", type);
            user.put("username", username);
            user.put("password", password);
            user.put("email", email);
            user.put("fullName", fullName);
            user.put("contactNumber", contactNumber);
            user.put("address", addressJ);

            System.out.println("User post made successfully");
            System.out.println(user.toString());
            return Response.ok(id, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.NOT_FOUND).entity("User could not be saved").build();
        }
    }
}
