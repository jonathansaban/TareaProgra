/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author DELL GP
 */
public class MainProducto {
    
    public static void main(String[] args) {
        Producto p = new Producto("123123", "camisa", 100);
        
        p.verProducto();
        System.out.println("-------------------------");
        p.setPrecio(-500);
        p.verProducto();
        System.out.println("-------------------------");
        p.setPrecio(80);
        p.verProducto();
    }
    
}
