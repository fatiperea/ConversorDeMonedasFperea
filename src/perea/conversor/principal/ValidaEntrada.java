package perea.conversor.principal;

import java.util.Scanner;

public class ValidaEntrada {

    public static int leerEntero(Scanner scanner) {
        int numero;
        while (true) {
            //System.out.print(mensaje);
            if (!scanner.hasNextInt() ) {
                System.out.println("Ingresa una opción válida. Intenta nuevamente");
                scanner.next();
                continue;
            }
            numero=scanner.nextInt();
            break;
        }

        return numero;
}

    public static double leerDouble(Scanner scanner) {
        double numero;
        while (true) {
            //System.out.print(mensaje);
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingresa un importe válido.");
                scanner.next();
                continue;
            }
            numero = scanner.nextDouble();
            if (numero <= 0) {
                System.out.println("Ingresa un valor positivo");
                continue;
            }
            break;
        }
        return numero;
    }


/*public static void rango(Scanner scanner, int opcion){

    while (true){

        //int auxiliar= scanner.nextInt();
        if (opcion >5 || opcion<0) {
            System.out.println("Error: Fuera de rango. Intenta nuevamente");
            scanner.next();
            continue;
        }
        int numero = auxiliar;
        break;
    }



}*/
}