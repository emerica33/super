/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Principal {
    
    public static void main(String[] args) {
     
        
        Comprador c1 = new Comprador("95733504", "Gabriel", "Maza", 3);
        System.out.println(c1.nombre+" "+c1.apellido+", "+c1.dni+", "+c1.idComprador);
    }
    
}
