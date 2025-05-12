package perea.conversor.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String apiKey="98940a4ca8e53fb94f327ebb";
        List<String> monedas = new ArrayList<>(List.of("Peso Argentino (ARS)", "Peso Colombiano (COP)",
                "Peso Boliviano (BOB)", "Real Brasileño (BRL)", "Dólar Estadounidense (USD)"));

        Scanner lectura= new Scanner(System.in);

        System.out.println("Soy la API Conversor de monedas y te doy la bienvenida");

        while (!monedas.isEmpty()) {
            System.out.println("\n🔹 Monedas disponibles:");
            for (int i = 0; i < monedas.size(); i++) {
                System.out.println((i + 1) + ". " + monedas.get(i));
            }
            System.out.println("0. Salir");

            System.out.print("Selecciona moneda inicial: ");
            if (!lectura.hasNextInt()) {
                System.out.println("Entrada inválida, intenta nuevamente");
                lectura.next();
                continue;
            }

            int opcion = lectura.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }


        }


    }
}
