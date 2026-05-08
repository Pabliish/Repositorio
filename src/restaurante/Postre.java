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

    enum Formato{
        PORCION, TARRINA, TAZA
    }
    Formato formato;
    
    
    public Postre(String codigo, String nombre, String formato) {
        super(codigo, nombre, formato);
    }

    @Override
    public float precio() {
        switch (formato) {
            case PORCION:
                return 6f;
            case TARRINA:
                return 4.5f;
            case TAZA:
                return 2f;
            default:
                return 0;
        }
    }
    
}
