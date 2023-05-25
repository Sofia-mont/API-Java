
package main.java.com.sofia.thecnicaltest.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/nexsys/v1")
public class ProductService {


    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_JSON)
    public static Response getProducts() throws IOException{

        StringBuffer response = new StringBuffer();
        URL obj = new URL("https://api.escuelajs.co/api/v1/products");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent","Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            // success
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            // print result
            System.out.println(response);
        } else {
            System.out.println("GET request did not work.");
        }
        return Response.ok(response).build();
    }
}
