package perea.conversor.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String apiKey="98940a4ca8e53fb94f327ebb";

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
            /*if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }*/
            switch (opcion){
                case 1 -> {


                }
                case 2 -> {
                }
                case 3 -> {}
                case 4 -> {}
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
