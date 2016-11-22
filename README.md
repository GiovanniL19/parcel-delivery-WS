# Parcel-Delivery-System-WS
Web service for parcel delivery system android application

Running the Service Locally
- Open the project in glassfish
- Run the project
- Go To http://localhost:8080/Parcel-Delivery-System-WS/


Example Request:
<?xml version="1.0" encoding="UTF-8"?><S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/" xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <S:Body>
        <ns2:getUsers xmlns:ns2="http://giovannilenguito.co.uk/">
            <type>1</type>
            <method>xml</method>
        </ns2:getUsers>
    </S:Body>
</S:Envelope>
