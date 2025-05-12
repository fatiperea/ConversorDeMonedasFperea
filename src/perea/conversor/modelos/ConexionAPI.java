package perea.conversor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {
    private String direccion="https://v6.exchangerate-api.com/v6/98940a4ca8e53fb94f327ebb/pair/";

    public double armaDireccion(String usd, String ars){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + "USD" + "/" + "ARS"))
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            return jsonObject.get("conversion_rate").getAsDouble();



        }catch (Exception e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
    public double invertir(String ars, String usd) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + "ARS" + "/" + "USD"))
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            return jsonObject.get("conversion_rate").getAsDouble();


        } catch (Exception e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
}
