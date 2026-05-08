/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author dam1
 */
public class Comida extends ProductoCarta {

    enum Formato {
        TAPA, MEDIA, RACION
    }
    Formato formato;

    public Comida(String codigo, String nombre, String formato) {
        super(codigo, nombre, formato);
    }

    @Override
    public float precio() {

        switch (formato) {
            case TAPA:
                return 3.5f;
            case MEDIA:
                return 8f;
            case RACION:
                return 15f;
            default:
                return 0;
        }
    }

}
