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
                8-Boliviano a Dólar
                9-Salir""";

        System.out.println("Soy la API Conversor de monedas y te doy la bienvenida");

        Scanner lectura= new Scanner(System.in);

        while (true){

            System.out.println("Selecciona:\n"+ menu);

            int opcion=ValidaEntrada.leerEntero(lectura);

            if(opcion >= 1 && opcion <= 9){
                switch (opcion){
                    case 1 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Arg conexion = new ConexionAPI_Arg();
                        double tasa = conexion.obtenerTasa("USD","ARS");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f pesos argentinos",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("ARS", "USD");

                        System.out.println(String.format("%.2f pesos argentinos equivalen a %.2f dólares",cantidad,tasa2*cantidad));
                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 2 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Bra conexion = new ConexionAPI_Bra();
                        double tasa = conexion.obtenerTasa("USD", "BRL");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f reales",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("BRL", "USD");
                        System.out.println(String.format("%.2f reales equivalen a %.2f dólares",cantidad,tasa2*cantidad));

                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 3 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Col conexion = new ConexionAPI_Col();
                        double tasa = conexion.obtenerTasa("USD","COP");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f pesos colombianos",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("COP", "USD");
                        System.out.println(String.format("%.2f pesos colombianos equivalen a %.2f dólares",cantidad,tasa2*cantidad));
                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 4 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Bol conexion = new ConexionAPI_Bol();
                        double tasa = conexion.obtenerTasa("USD","BOB");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f bolivianos",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.invertir("BOB", "USD");
                        System.out.println(String.format("%.2f bolivianos equivalen a %.2f dólares",cantidad,tasa2*cantidad));
                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 5 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Arg conexion = new ConexionAPI_Arg();

                        double tasa = conexion.invertir("ARS", "USD");
                        System.out.println(String.format("%.2f pesos argentinos equivalen a %.2f dólares",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.obtenerTasa("USD","ARS");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f pesos argentinos",cantidad,tasa2*cantidad));

                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 6 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Bra conexion = new ConexionAPI_Bra();

                        double tasa = conexion.invertir("BRL", "USD");
                        System.out.println(cantidad+" reales equivalen a "+tasa*cantidad +" dólares");
                        System.out.println(String.format("%.2f reales equivalen a %.2f dólares",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.obtenerTasa("USD", "BRL");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f reales",cantidad,tasa2*cantidad));

                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 7 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Col conexion = new ConexionAPI_Col();

                        double tasa = conexion.invertir("COP", "USD");
                        System.out.println(cantidad+" pesos colombianos equivalen a "+tasa*cantidad +" dólares");
                        System.out.println(String.format("%.2f pesos colombianos equivalen a %.2f dólares",cantidad,tasa*cantidad));

                        System.out.println("\nConversión invertida: ");
                        double tasa2 = conexion.obtenerTasa("USD","COP");

                        System.out.println(String.format("%.2f dólares equivalen a %.2f pesos colombianos",cantidad,tasa2*cantidad));

                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                    case 8 -> {
                        System.out.println("Ingrese monto a convertir: ");

                        double cantidad = ValidaEntrada.leerDouble(lectura);

                        ConexionAPI_Bol conexion = new ConexionAPI_Bol();
                        double tasa = conexion.invertir("BOB", "USD");
                        System.out.println(cantidad+" bolivianos equivalen a "+tasa*cantidad +" dólares");
                        System.out.println(String.format("%.2f bolivianos equivalen a %.2f dólares",cantidad,tasa*cantidad));

                        double tasa2 = conexion.obtenerTasa("USD","BOB");

                        System.out.println("\nConversión invertida: ");
                        System.out.println(String.format("%.2f dólares equivalen a %.2f bolivianos",cantidad,tasa2*cantidad));

                        System.out.println("-------------------------------------------------------------");
                        continue;
                    }
                        case 9 -> {
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
