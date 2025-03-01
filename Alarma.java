/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author DELL GP
 */
public class Alarma {

    private int tiempoObjetivo;  // Tiempo objetivo en segundos
    
 
    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }
    

    public boolean haSonado(int tiempoActual) {
        return tiempoActual >= tiempoObjetivo;
    }

    public void activarAlarma() {
        System.out.println("¡Alarma activada! El tiempo objetivo ha sido alcanzado.");
    }
    
    public int getTiempoObjetivo() {
        return tiempoObjetivo;
    }
    
}
