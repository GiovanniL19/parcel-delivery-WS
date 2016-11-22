/*
 * Giovanni Lenguito <www.giovannilenguito.co.uk>
 */
package uk.co.giovannilenguito;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author giovannilenguito
 */
@WebService(serviceName = "main")
@Stateless()
public class PDS {
    /**
     * Get Parcel Web service operation
     */
    @WebMethod(operationName = "getParcel")
    public String getParcel(@WebParam(name = "id") int id, @WebParam(name = "method") String method) {
        if(method.equalsIgnoreCase("json")){
            return  "{" +
                    "  \"id\": 0," +
                    "  \"createdByID\": 1," +
                    "  \"customerID\": 0," +
                    "  \"recipientName\": \"Test\"," +
                    "  \"serviceType\": \"First Class Tracked\"," +
                    "  \"contents\": \"This parcel contains items, weighs about 1kg\"," +
                    "  \"dateBooked\": \"05/11/2016\", " +
                    "  \"deliveryDate\": \"15/11/2016\", " +
                    "  \"isDelivered\": false, " +
                    "  \"isOutForDelivery\": false, " +
                    "  \"isProcessing\": true, " +
                    "  \"address\": {" +
                    "    \"lineOne\": \"1 Close\"," +
                    "    \"lineTwo\": \"\"," +
                    "    \"city\": \"City One\"," +
                    "    \"postcode\": \"CL0 5ER\"," +
                    "    \"country\": \"Unted Kingdom\"" +
                    "  }" +
                    "}";
        }else{
            return  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "  <parcel>" +
                "    <id>0</id>" +
                "    <createdByID>1</createdByID>" +
                "    <customerID>0</customerID>" +
                "    <recipientName>Test</recipientName>" +
                "    <serviceType>First Class Tracked</serviceType>" +
                "    <contents>This parcel contains items, weighs about 1kg</contents>" +
                "    <dateBooked>05/11/2016</dateBooked>" +
                "    <deliveryDate>15/11/2016</deliveryDate>" +
                "    <isDelivered>false</isDelivered>" +
                "    <isOutForDelivery>false</isOutForDelivery>" +
                "    <isProcessing>true</isProcessing>" +
                "       <address>" +
                "          <lineOne>1 Close</lineOne>" +
                "          <lineTwo></lineTwo>" +
                "          <city>City One</city>" +
                "          <postcode>CL0 5ER</postcode>" +
                "          <country>United Kingdom</country>" +
                "       </address>" +
                "</parcels>";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUsers")
    public String getUsers(@WebParam(name = "type") String type, @WebParam(name = "method") String method) {
        return  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<users>" +
                "  <user>" +
                "       <id>2</id>" +
                "       <type>Customer</type>" +
                "       <username>CharlotteD</username>" +
                "       <password>123</password>" +
                "       <email>char@gmail.com</email>" +
                "       <fullName>Charlotte D</fullName>" +
                "       <contactNumber>01234567890</contactNumber>" +
                "       <address>" +
                "          <lineOne>1 Close</lineOne>" +
                "          <lineTwo></lineTwo>" +
                "          <city>City One</city>" +
                "          <postcode>CL0 5ER</postcode>" +
                "          <country>United Kingdom</country>" +
                "       </address>" +
                "  </user>" +
                "  <user>" +
                "       <id>1</id>" +
                "       <type>Driver</type>" +
                "       <username>GiovanniL</username>" +
                "       <password>123</password>" +
                "       <email>g@gmail.com</email>" +
                "       <fullName>Giovanni L</fullName>" +
                "       <contactNumber>01234567890</contactNumber>" +
                "       <address>" +
                "          <lineOne>1 Close</lineOne>" +
                "          <lineTwo></lineTwo>" +
                "          <city>City One</city>" +
                "          <postcode>CL0 5ER</postcode>" +
                "          <country>United Kingdom</country>" +
                "       </address>" +
                "  </user>" +
                "</users>";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUser")
    public String getUser(@WebParam(name = "id") int id, @WebParam(name = "method") String method) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCustomerParcels")
    public String getCustomerParcels(@WebParam(name = "id") int id, @WebParam(name = "method") String method) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getDriverParcels")
    public String getDriverParcels(@WebParam(name = "id") int id, @WebParam(name = "method") String method) {
        //TODO write your implementation code here:
        return null;
    }
}
