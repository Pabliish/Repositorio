package restaurante;

import java.util.ArrayList;

/**
 *
 * @author mgb
 */
public class Restaurante
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Mesa> reservas;
        ///////////////////////
        // Escribe tu código //
        ///////////////////////
        int opcion = menu();
        
        
        while (opcion != 0)
        {
            switch (opcion)
            {
                case 1:
                    // Código de la opción de menú //
                    break;
                case 2:
                    // Código de la opción de menú //
                    break;
                case 3:
                    // Código de la opción de menú //
                    break;
                case 4:
                    // Código de la opción de menú //
                    break;
                case 5:
                    // Código de la opción de menú //
                    break;
                case 6:
                    // Código de la opción de menú //
                    break;
                case 7:
                    // Código de la opción de menú //
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

    public static int menu()
    {
        int opcion;
        
        System.out.println("Ejercico restaurante");
        System.out.println("-------------------");
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
