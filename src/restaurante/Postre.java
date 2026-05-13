/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author dam1
 */
public class Postre extends ProductoCarta {

    
    
    
    public Postre(String codigo, String nombre, String formato) {
        super(codigo, nombre, formato);
    }

    @Override
    public float precio() {
        switch (formato.toUpperCase()) {
            case "PORCION":
                return 6.0f;
            case "TARRINA":
                return 4.5f;
            case "TAZA":
                return 2.0f;
            default:
                return 0;
        }
    }
    
}
