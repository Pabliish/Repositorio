
package restaurante;

/**
 *
 * @author mgb
 */
public class Comanda
{

    private String codigo;
    private int cantidad;

    public Comanda(String codigo, int cantidad)
    {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

}
