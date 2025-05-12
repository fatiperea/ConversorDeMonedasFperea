package perea.conversor.principal;

import perea.conversor.modelos.ConexionAPI_Arg;

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

                    System.out.println("Resultado "+tasa*cantidad);

                    System.out.println("Conversion invertida: ");
                    double tasa2 = conexion.invertir("ARS", "USD");
                    System.out.println("Resultado "+tasa2*cantidad);
                    continue;

                    //break;

                }
                case 2 -> {
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
    }
}
