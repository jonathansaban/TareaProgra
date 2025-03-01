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
public class Producto {
    private String id;
    private String nombreProducto;
    private double precio;

    public Producto(String id, String nombreProducto, double precio) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        setPrecio(precio);
    }
    
    public void verProducto(){
        System.out.println("id: " + id);
        System.out.println("nombre: " + nombreProducto);
        System.out.println("precio: " + precio);
    }


    
    //setters y getters


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0 ){
            System.out.println("error no se permiten valores negativos");
        } else{
            this.precio = precio;
        }
    }
    
    
    
    
    
}
