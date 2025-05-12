package perea.conversor.modelos;
import java.util.ArrayList;
import java.util.List;
public class MenuMonedas {

        private List<String> monedas;

        public MenuMonedas() {
            monedas = new ArrayList<>(List.of("ARS", "COP", "BOB", "BRL", "USD"));
        }

        public void mostrarMonedas() {
            System.out.println("\nMonedas disponibles para conversión:");
            for (int i = 0; i < monedas.size(); i++) {
                System.out.println((i + 1) + ". " + monedas.get(i));
            }
            System.out.println("0. Salir");
        }

        public boolean eliminarMoneda(int opcion) {
            if (opcion >= 1 && opcion <= monedas.size()) {
                monedas.remove(opcion - 1);
                return true;
            }
            return false;
        }

        public boolean listaVacia() {
            return monedas.isEmpty();
        }

}
