/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author dam1
 */
public class Bebida extends ProductoCarta {

    enum Formato {
        COPA, JARRA, BOTELLA
    }
    Formato formato;

    public Bebida(String codigo, String nombre, String formato) {
        super(codigo, nombre, formato);
    }

    @Override
    public float precio() {
        switch (formato) {
            case COPA:
                return 2.5f;
            case JARRA:
                return 5.5f;
            case BOTELLA:
                return 3.5f;
                default:
                    return 0;
        }

    }

}
