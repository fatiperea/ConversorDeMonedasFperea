package perea.conversor.principal;

import perea.conversor.modelos.ConexionAPI_Arg;
import perea.conversor.modelos.ConexionAPI_Bol;
import perea.conversor.modelos.ConexionAPI_Bra;
import perea.conversor.modelos.ConexionAPI_Col;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu= """
                1-Dólar a Peso Argentino
                2-Dólar a Real Brasilero
                3-Dólar a Peso Colombiano
                4-Dólar a Boliviano
                5-Peso Argentino a Dólar
                6-Real Brasilero a Dólar
                7-Peso Colombiano a Dólar
                8-Salir""";

        System.out.println("Soy la API Conversor de monedas y te doy la bienvenida");

        Scanner lectura= new Scanner(System.in);

        while (true){

            System.out.println("Selecciona:\n"+ menu);

            int opcion=ValidaEntrada.leerEntero(lectura);

            if(opcion >= 1 && opcion <= 8){
                switch (opcion){
                    case 1 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Arg conexion = new ConexionAPI_Arg();
                        double tasa = conexion.obtenerTasa("USD","ARS");

                        System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" pesos argentinos");

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("ARS", "USD");
                        System.out.println(cantidad+" pesos argentinos equivalen a "+tasa2*cantidad +" dólares");
                        System.out.println("-----------------------------");
                        continue;
                    }
                    case 2 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Bra conexion = new ConexionAPI_Bra();
                        double tasa = conexion.obtenerTasa("USD", "BRL");

                        System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" reales");

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("BRL", "USD");
                        System.out.println(cantidad+" reales equivalen a "+tasa2*cantidad +" dólares");
                        System.out.println("-----------------------------");
                        continue;

                    }
                    case 3 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Col conexion = new ConexionAPI_Col();
                        double tasa = conexion.obtenerTasa("USD","COP");

                        System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" pesos colombianos");

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("COP", "USD");
                        System.out.println(cantidad+" pesos colombianos equivalen a "+tasa2*cantidad +" dólares");
                        System.out.println("-----------------------------");
                        continue;

                    }
                    case 4 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Bol conexion = new ConexionAPI_Bol();
                        double tasa = conexion.obtenerTasa("USD","BOB");

                        System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" bolivianos");

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("BOB", "USD");
                        System.out.println(cantidad+" bolivianos equivalen a "+tasa2*cantidad +" dólares");
                        System.out.println("-----------------------------");
                        continue;

                    }
                    case 5 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Arg conexion = new ConexionAPI_Arg();
                        //double tasa = conexion.obtenerTasa("USD","ARS");

                        //System.out.println(cantidad+" dólares equivalen a "+tasa*cantidad +" pesos argentinos");

                        //System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("ARS", "USD");
                        System.out.println(cantidad+" pesos argentinos equivalen a "+tasa2*cantidad +" dólares");
                        System.out.println("-----------------------------");
                        continue;
                    }
                    case 8 -> {
                        System.out.println("Saliendo...");
                    }
                }
                break;
            }else{
                System.out.println("Ingresa una opción correcta:");
                lectura.next();
            }
        }
        lectura.close();
    }
}
