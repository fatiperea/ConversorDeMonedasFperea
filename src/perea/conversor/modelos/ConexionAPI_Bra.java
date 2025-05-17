package perea.conversor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI_Bra {

    private String direccion="https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/";

    public double obtenerTasa(String usd, String brl){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + usd + "/" + brl))
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.body() == null || response.body().isEmpty()) {
                throw new RuntimeException("Error: respuesta vacía.");
            }

            //System.out.println(response.body());

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
    public double invertir(String brl, String usd) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + brl + "/" + usd))
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
