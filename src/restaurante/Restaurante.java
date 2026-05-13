package restaurante;

import java.util.ArrayList;

/**
 *
 * @author mgb
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa.cargarFicheroCarta();
        ArrayList<Mesa> reservas = new ArrayList<>();
        Mesa j = new Mesa(1, 3);
        reservas.add(j);
        ///////////////////////
        // Escribe tu código //
        ///////////////////////
        int opcion = menu();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    Mesa.verCarta();
                    break;
                case 2:
                    for (Mesa a : reservas) {
                        System.out.println(a.toString());
                    }
                    break;
                case 3:
                    System.out.println("Cuantas personas son para la reserva?");
                    int comensales = ES.leerEntero();
                    Mesa m = new Mesa(reservas.size() + 1, comensales);
                    reservas.add(m);
                    System.out.println("Mesa reservada correctamente.\n\n\n");

                    break;
                case 4:
                    int nMesa = ES.leerEntero("Numero de mesa: ");

                    if (nMesa > 0 && nMesa <= reservas.size()) {
                        reservas.get(nMesa - 1).cargarComanda();
                        System.out.println("Comanda cargada correctamente.");
                    } else {
                        System.out.println("Mesa no válida.");
                    }

                    break;
                case 5:
                    int numM = ES.leerEntero("Numero de mesa (0 para salir): ");

                    if (numM == 0) {
                        break;
                    }

                    if (numM > 0 && numM <= reservas.size()) {
                        reservas.get(numM - 1).verComanda();
                    } else {
                        System.out.println("Mesa no encontrada");
                    }
                    break;
                case 6:
                    numM = ES.leerEntero("Numero de mesa (0 para salir): ");
                    if (numM == 0) {
                        break;
                    }

                    if (numM > 0 && numM <= reservas.size()) {
                        reservas.get(numM - 1).ticket();
                    } else {
                        System.out.println("Mesa no encontrada");
                    }
                    break;
                case 7:
                    numM = ES.leerEntero("Numero de mesa (0 para salir): ");
                    if (numM == 0) {
                        break;
                    }

                    if (numM > 0 && numM <= reservas.size()) {
                        //BORRAR COMANDA (HACER)
                    } else {
                        System.out.println("Mesa no encontrada");
                    }
                    break;
            }
            ///////////////////////
            // Escribe tu código //
            ///////////////////////
            opcion = menu();
        }

        ///////////////////////
        // Escribe tu código //
        ///////////////////////
    }

    public static int menu() {
        int opcion;

        System.out.println(" ----------------------");
        System.out.println("| Ejercico restaurante |");
        System.out.println(" ----------------------");
        System.out.println("1. Ver Carta.");
        System.out.println("2. Ver mesas reservadas.");
        System.out.println("3. Reservar mesa.");
        System.out.println("4. Cargar comanda de una mesa desde archivo.");
        System.out.println("5. Ver comanda de una mesa.");
        System.out.println("6. Ver ticket de una mesa.");
        System.out.println("7. Borrar toda la comanda de una mesa.");
        System.out.println("0. Salir");
        opcion = ES.leerEntero("\n¿Opción?: ");

        return opcion;
    }

}
