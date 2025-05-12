package perea.conversor.modelos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConexionAPI {
    private String direccion="https://v6.exchangerate-api.com/v6/98940a4ca8e53fb94f327ebb/pair/";

    public void direccion(String usd, String ars){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + "USD" + "/" + "ARS"))
                    .GET()
                    .build();
        }catch (Exception e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
}
