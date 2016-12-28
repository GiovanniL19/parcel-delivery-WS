import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by giovannilenguito on 23/11/2016.
 */
@Path("/")
public class Main {
    @GET
    @Produces({MediaType.TEXT_HTML})
    public String drivers() {
        return "<html>" +
                "<h4>Welcome to Parcel Delivery System REST Web Service</h4>" +
                "<h4>/drivers</h4>" +
                "<h4>/customers</h4>" +
                "<h4>/parcels</h4>" +
                "<h4>/logs</h4>" +
                "<h4>/locations</h4>" +
                "</html>";
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
