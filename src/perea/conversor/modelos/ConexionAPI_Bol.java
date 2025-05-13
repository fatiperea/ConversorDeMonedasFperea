package perea.conversor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI_Bol {

    private String direccion="https://v6.exchangerate-api.com/v6/98940a4ca8e53fb94f327ebb/pair/";

    public double obtenerTasa(String bob, String ars){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + "USD" + "/" + "BOB"))
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());

            if (response.body() == null || response.body().isEmpty()) {
                throw new RuntimeException("Error: respuesta vacía.");
            }

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            if (!jsonObject.has("conversion_rate")) {
                throw new RuntimeException("Error: No se encontró la tasa de conversión");
            }

            return jsonObject.get("conversion_rate").getAsDouble();

        }catch (Exception e) {
            System.out.println("Error al obtener tasa de conversión "+e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public double invertir(String bob, String usd) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + "BOB" + "/" + "USD"))
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());

            if (response.body() == null || response.body().isEmpty()) {
                throw new RuntimeException("Error: respuesta vacía.");
            }

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            if (!jsonObject.has("conversion_rate")) {
                throw new RuntimeException("Error: No se encontró la tasa de conversión");
            }

            return jsonObject.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            System.out.println("Error al obtener tasa de conversión "+e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
