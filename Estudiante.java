/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author DELL GP
 */
public class Estudiante {
    private String nombre;
    private String carnet;
    private double notaFinal;

    public Estudiante(String nombre, String carnet, double notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.notaFinal = notaFinal;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    
    
    
}
