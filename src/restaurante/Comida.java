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

    

    public Comida(String codigo, String nombre, String formato) {
        super(codigo, nombre, formato);
    }

    @Override
    public float precio() {

        switch (formato.toUpperCase()) {
            case "TAPA":
                return 3.5f;
            case "MEDIA":
                return 8.0f;
            case "RACION":
                return 15.0f;
            default:
                return 0;
        }
    }

}
