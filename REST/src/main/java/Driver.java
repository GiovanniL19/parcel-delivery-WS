import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by giovannilenguito on 23/11/2016.
 */
@Path("/driver")
public class Driver {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "application/json"
    @Produces("application/json")
    public String response() {
        // Return some cliched textual content
        return "Test World";
    }



}
