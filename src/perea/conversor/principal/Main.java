package perea.conversor.principal;

import perea.conversor.modelos.ConexionAPI_Arg;
import perea.conversor.modelos.ConexionAPI_Bra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu= """
                1-Dólar a Peso Argentino
                2-Dólar a Real Brasilero
                3-Dólar a Peso Colombiano 
                4-Dólar a Boliviano     
                5-Salir""";

        System.out.println("Soy la API Conversor de monedas y te doy la bienvenida");

        Scanner lectura= new Scanner(System.in);

        while (true){

            System.out.println("Selecciona:\n"+ menu);

            int opcion=ValidaEntrada.leerEntero(lectura);

            //ValidaEntrada.rango(lectura,opcion);

            if(opcion>=1 && opcion<6){
            switch (opcion){
                case 1 -> {
                    System.out.println("Ingrese monto a convertir: ");

                    double cantidad = ValidaEntrada.leerDouble(lectura);

                    ConexionAPI_Arg conexion = new ConexionAPI_Arg();
                    double tasa = conexion.obtenerTasa("USD","ARS");

                    //ConversorDeMonedas conversor= new ConversorDeMonedas();
                    //conversor.convertir(tasa);

                    System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" pesos argentinos");

                    System.out.println("\nConversión invertida: ");
                    double tasa2 = conexion.invertir("ARS", "USD");
                    System.out.println(cantidad+" pesos argentinos equivalen a "+tasa2*cantidad +" dólares");
                    System.out.println("-----------------------------");
                    continue;

                    //break;
                }
                case 2 -> {
                    System.out.println("Ingrese monto a convertir: ");

                    double cantidad = ValidaEntrada.leerDouble(lectura);

                    ConexionAPI_Bra conexion = new ConexionAPI_Bra();
                    double tasa = conexion.obtenerTasa("USD", "BRL");

                    //ConversorDeMonedas conversor= new ConversorDeMonedas();
                    //conversor.convertir(tasa);

                    System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" pesos argentinos");

                    System.out.println("\nConversión invertida: ");
                    double tasa2 = conexion.invertir("BRL", "USD");
                    System.out.println(cantidad+" pesos argentinos equivalen a "+tasa2*cantidad +" dólares");
                    System.out.println("-----------------------------");
                    continue;

                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> {
                    System.out.println("Saliendo...");
                    break;
                }
            }
            break;
        }else{
                System.out.println("Ingrese nuevamente:");
                lectura.next();
            }
        }
        lectura.close();
    }
}
