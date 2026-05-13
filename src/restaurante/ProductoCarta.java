
package restaurante;

/**
 *
 * @author mgb
 */

public abstract class ProductoCarta
{

    private String codigo;
    private String nombre;
    protected String formato;
    

    public ProductoCarta(String codigo, String nombre, String formato)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.formato = formato;
    }

    public String getFormato()
    {
        return formato;
    }

    public void setFormato(String formato)
    {
        this.formato = formato;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo);
        sb.append(" ").append(formato);
        sb.append("\t").append(nombre);
        sb.append(nombre.length() > 7 ? "\t" : "\t\t").append(this.precio()).append("€");
        return sb.toString();
    }

    abstract public float precio();

}
