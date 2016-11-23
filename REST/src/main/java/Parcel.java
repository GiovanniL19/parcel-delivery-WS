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
@Path("/parcels")
public class Parcel{

    @GET
    @Path("/byCustomer/{id}")
    @Produces("application/json")
    public Response getParcelByCustomer(@PathParam("id") String id) throws JSONException {
        if(id.equals("1")) {
            JSONArray parcels = new JSONArray();

            //HARD CODE JSON OBJECT
            JSONObject address = new JSONObject();
            address.put("lineOne", "2 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            JSONObject parcel = new JSONObject();
            parcel.put("id", "0");
            parcel.put("createdByID", "1");
            parcel.put("customerID", "2");
            parcel.put("recipientName", "Test");
            parcel.put("serviceType", "First Class Tracked");
            parcel.put("contents", "This parcel contains items, weighs about 1kg");
            parcel.put("dateBooked", "05/11/2016");
            parcel.put("deliveryDate", "15/11/2016");
            parcel.put("isDelivered", false);
            parcel.put("isOutForDelivery", false);
            parcel.put("isProcessing", true);
            parcel.put("address", address);

            parcels.put(parcel);

            if(parcels.length() > 0){
                return Response.ok(parcels.toString(), MediaType.APPLICATION_JSON).build();
            }else{
                return Response.status(Response.Status.NOT_FOUND).entity("Parcels not found").build();
            }
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Parcel not found with id of " + id).build();
        }
    }

    @GET
    @Path("/byCreatedId/{id}")
    @Produces("application/json")
    public Response getParcelByCreated(@PathParam("id") String id) throws JSONException {
        System.out.println(id);
        System.out.println("ENDPOINT HIT");
        if(id.equals("1")) {
            JSONArray parcels = new JSONArray();

            //HARD CODE JSON OBJECT
            JSONObject address = new JSONObject();
            address.put("lineOne", "2 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            JSONObject parcel = new JSONObject();
            parcel.put("id", "0");
            parcel.put("createdByID", "1");
            parcel.put("customerID", "2");
            parcel.put("recipientName", "Test");
            parcel.put("serviceType", "First Class Tracked");
            parcel.put("contents", "This parcel contains items, weighs about 1kg");
            parcel.put("dateBooked", "05/11/2016");
            parcel.put("deliveryDate", "15/11/2016");
            parcel.put("isDelivered", false);
            parcel.put("isOutForDelivery", false);
            parcel.put("isProcessing", true);
            parcel.put("address", address);

            parcels.put(parcel);

            JSONObject parcel1 = new JSONObject();
            parcel1.put("id", "1");
            parcel1.put("createdByID", "1");
            parcel1.put("customerID", "2");
            parcel1.put("recipientName", "Test 2");
            parcel1.put("serviceType", "Second Class Tracked");
            parcel1.put("contents", "This parcel contains an item, weighs about 0..5kg");
            parcel1.put("dateBooked", "10/11/2016");
            parcel1.put("deliveryDate", "25/11/2016");
            parcel1.put("isDelivered", false);
            parcel1.put("isOutForDelivery", true);
            parcel1.put("isProcessing", false);
            parcel1.put("address", address);

            parcels.put(parcel1);

            if(parcels.length() > 0){
                return Response.ok(parcels.toString(), MediaType.APPLICATION_JSON).build();
            }else{
                return Response.status(Response.Status.NOT_FOUND).entity("Parcels not found").build();
            }
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Parcels not found with id of " + id).build();
        }
    }

    @GET
    @Path("/byID/{id}")
    @Produces("application/json")
    public Response getParcelById(@PathParam("id") String id) throws JSONException {
        if(id.equals(0)) {
            //HARD CODE JSON OBJECT
            JSONObject parcel = new JSONObject();
            parcel.put("id", "0");
            parcel.put("createdByID", "1");
            parcel.put("customerID", "2");
            parcel.put("recipientName", "Test");
            parcel.put("serviceType", "First Class Tracked");
            parcel.put("contents", "This parcel contains items, weighs about 1kg");
            parcel.put("dateBooked", "05/11/2016");
            parcel.put("deliveryDate", "15/11/2016");
            parcel.put("isDelivered", false);
            parcel.put("isOutForDelivery", false);
            parcel.put("isProcessing", true);

            JSONObject address = new JSONObject();
            address.put("lineOne", "2 Close");
            address.put("lineTwo", "");
            address.put("city", "London");
            address.put("postcode", "L0 2DO");
            address.put("country", "United Kingdom");

            parcel.put("address", address);

            return Response.ok(parcel.toString(), MediaType.APPLICATION_JSON).build();
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Parcel not found with id of " + id).build();
        }
    }

    @GET
    @Path("/all")
    @Produces("application/json")
    public Response getAllParcels() throws JSONException {
        JSONArray parcels = new JSONArray();

        //HARD CODE JSON OBJECT
        JSONObject address = new JSONObject();
        address.put("lineOne", "2 Close");
        address.put("lineTwo", "");
        address.put("city", "London");
        address.put("postcode", "L0 2DO");
        address.put("country", "United Kingdom");

        JSONObject parcel = new JSONObject();
        parcel.put("id", "0");
        parcel.put("createdByID", "1");
        parcel.put("customerID", "2");
        parcel.put("recipientName", "Test");
        parcel.put("serviceType", "First Class Tracked");
        parcel.put("contents", "This parcel contains items, weighs about 1kg");
        parcel.put("dateBooked", "05/11/2016");
        parcel.put("deliveryDate", "15/11/2016");
        parcel.put("isDelivered", false);
        parcel.put("isOutForDelivery", false);
        parcel.put("isProcessing", true);
        parcel.put("address", address);

        parcels.put(parcel);

        if(parcels.length() > 0){
            return Response.ok(parcels.toString(), MediaType.APPLICATION_JSON).build();
        }else{
            return Response.status(Response.Status.NOT_FOUND).entity("Parcels not found").build();
        }
    }
}
