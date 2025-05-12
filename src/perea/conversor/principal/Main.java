package perea.conversor.principal;

import perea.conversor.modelos.ConexionAPI;
import perea.conversor.modelos.ConversorDeMonedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String apiKey="98940a4ca8e53fb94f327ebb";

        String menu= """
                1-Dólar a Peso Argentino
                2-Dólar a Real Brasilero
                3-Dólar a Peso Colombiano 
                4-Peso Colombiano a Dólar
                5-Invertir conversión
                6-Salir""";

        System.out.println("Soy la API Conversor de monedas y te doy la bienvenida");

        Scanner lectura= new Scanner(System.in);

        while (true){

            System.out.println("Selecciona: \\n"+ menu);

            if (!lectura.hasNextInt()) {
                System.out.println("Entrada inválida, intenta nuevamente");
                lectura.next();
                continue;
            }

            int opcion=lectura.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.println("Ingrese monto a convertir: ");

                    if (!lectura.hasNextDouble()) {
                        System.out.println("Error: Ingresa un número válido.");
                        lectura.next();
                        continue;
                    }

                    double cantidad = lectura.nextDouble();

                    ConexionAPI conexion= new ConexionAPI();
                    double tasa=conexion.armaDireccion("USD","ARS");

                    //ConversorDeMonedas conversor= new ConversorDeMonedas();

                    //conversor.convertir(tasa);

                    System.out.println("Resultado "+tasa*cantidad);

                    System.out.println("Conversion invertida: ");
                    double tasa2=conexion.invertir("ARS", "USD");
                    System.out.println("Resultado "+tasa2*cantidad);
                    continue;


                    //break;

                }
                case 2 -> {
                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                case 6 -> {
                    System.out.println("Saliendo...");
                    break;
                    //yield "";
                }
            }



            break;
        }


    }
}
