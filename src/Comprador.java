/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Comprador extends Humano {
    
    int idComprador;

    public Comprador(String dni, String nombre, String apellido, int idComprador) {
        
        super(dni, nombre, apellido);
        this.idComprador=idComprador;
    }
    
    
    
}
