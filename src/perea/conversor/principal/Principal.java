package perea.conversor.principal;

import perea.conversor.modelos.MenuMonedas;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;*/

public class Principal {
    /*public static void main(String[] args) {

        String apiKey="98940a4ca8e53fb94f327ebb";

        List<String> monedasMensaje = new ArrayList<>(List.of("Peso Argentino (ARS)", "Peso Colombiano (COP)",
                "Peso Boliviano (BOB)", "Real Brasileño (BRL)", "Dólar Estadounidense (USD)"));

        //List<String> monedas = new ArrayList<>(List.of("ARS", "COP", "BOB", "BRL", "USD"));
        MenuMonedas menu = new MenuMonedas();
        Scanner lectura= new Scanner(System.in);

        System.out.println("Soy la API Conversor de monedas y te doy la bienvenida");

        while (!menu.listaVacia()) {
            System.out.println("\nMonedas disponibles:");
            for (int i = 0; i < monedasMensaje.size(); i++) {
                System.out.println((i + 1) + ". " + monedasMensaje.get(i));
            }
            System.out.println("0. Salir");

            menu.mostrarMonedas();

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

            if (opcion < 1 || opcion > monedas.size()) {
                System.out.println("Entrada inválida, intenta nuevamente.");
                continue;
            }

            if (!menu.eliminarMoneda(opcion)) {
                System.out.println("Opción inválida, intenta nuevamente.");
                continue;
            }

            String monedaOrigen = monedas.get(opcion - 1);
            //System.out.println("Has seleccionado: " + monedasMensaje.get(opcion -1));

            monedas.remove(opcion - 1);
            monedasMensaje.remove(opcion -1);

            System.out.println("\nMonedas restantes:");
            for (int i = 0; i < monedasMensaje.size(); i++) {
                System.out.println((i + 1) + ". " + monedasMensaje.get(i));
            }
            System.out.println("Elige nuevamente: ");
            opcion = lectura.nextInt();
            String monedaDestino = monedas.get(opcion - 1);
            //System.out.println("Has seleccionado: " + monedasMensaje.get(opcion -1));

            System.out.println("Ingresa cantidad a convertir: ");
            double cantidad=lectura.nextDouble();

            System.out.println("Vas a convertir "+cantidad+" "+monedaOrigen+" a "+monedaDestino);

            break;

        }
        lectura.close();

    }*/
}
