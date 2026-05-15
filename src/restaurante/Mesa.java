package restaurante;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mgb
 */
public class Mesa {

    // Atributo de Clase, es "static"
    private static HashMap<String, ProductoCarta> carta = new HashMap<>();
    // Atributos de Instancia
    private int numero;
    private int comensales;
    private ArrayList<Comanda> comandas;

    public Mesa(int numero, int comensales) {
        this.numero = numero;
        this.comensales = comensales;
        this.comandas = new ArrayList<>();
    }

    public static void cargarFicheroCarta() {
        String nFichero = "carta.txt";
        File fichero = new File(nFichero);
        Scanner sc = null;

        try {
            System.out.println("Leyendo el contenido del fichero...........\n\n");
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");

                String codigo = partes[0];
                String nombre = partes[1];
                String formato = partes[2].toUpperCase();

                char tipo = codigo.charAt(0);

                switch (tipo) {
                    case 'b':

                        Bebida b = new Bebida(codigo, nombre, formato);
                        carta.put(codigo, b);
                        break;
                    case 'c':

                        Comida c = new Comida(codigo, nombre, formato);
                        carta.put(codigo, c);
                        break;
                    case 'p':

                        Postre p = new Postre(codigo, nombre, formato);
                        carta.put(codigo, p);
                        break;
                    default:
                        System.out.println("No se ha podido leer.");
                }
                

            }
            System.out.println("Carta cargada correctamente.....");

        } catch (Exception e) {
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            try {
                if (sc != null) {
                    sc.close();
                }
            } catch (Exception e2) {
                System.out.println("Mensaje fichero: " + e2.getMessage());
            }
        }

    }

    public static void verCarta() {
        for (ProductoCarta p : carta.values()) {
            System.out.println(p);
        }
    }

    public void cargarComanda() {
        String nfichero = "mesa" + numero + ".txt";
        File fichero = new File(nfichero);

        Scanner sc = null;

        try {
            sc = new Scanner(fichero);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");

                String codigoProducto = partes[0];
                int cantidad = Integer.parseInt(partes[1]);

                Comanda com = new Comanda(codigoProducto, cantidad);
                comandas.add(com);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public boolean insertaComanda(Comanda pedido) {

        if (carta.containsKey(pedido.getCodigo())) {
            comandas.add(pedido);
            return true;
        } else {
            System.out.println("El codigo del pedido no esta en la carta");
            return false;
        }
    }

    public ProductoCarta buscaPedido(String codigo) {
        if (carta.containsKey(codigo)) {
            return carta.get(codigo);
        }
        return null;
    }

    public float precioComanda(Comanda pedido) {
        ProductoCarta p = carta.get(pedido.getCodigo());
        float precio = pedido.getCantidad() * p.precio();
        return precio;
    }

    public float precioTotal() {
        int total = 0;
        for (Comanda c : comandas) {
            total += precioComanda(c);
        }
        return total;
    }

    public void verComanda() {
        comandas.sort(Comparator.comparing(Comanda::getCodigo));

        for (Comanda c : comandas) {
            ProductoCarta p = carta.get(c.getCodigo());

            System.out.printf(
                    "%-3d %-8s %-20s %.2f€%n",
                    c.getCantidad(),
                    c.getCodigo(),
                    p.getNombre(),
                    p.precio());
        }
    }

    public void ticket() {
        comandas.sort(Comparator.comparing(Comanda::getCodigo));

        for (Comanda c : comandas) {
            ProductoCarta p = carta.get(c.getCodigo());

            float precio = p.precio();
            float total = precio * c.getCantidad();

            System.out.printf(
                    "%-8s %-20s %.2f€ * %d = %.2f€%n",
                    c.getCodigo(),
                    p.getNombre(),
                    precio,
                    c.getCantidad(),
                    total
            );
        }
        System.out.println("--------------------------------");
        System.out.printf("TOTAL; %.2f€%n", precioTotal());
    }
    
    public void borrarComanda(){
            comandas.clear();
    }

    @Override
    public String toString() {
        return String.format(
        "Mesa %-3d | Comensales: %d",
        numero,
        comensales);
    }
    
    
}
