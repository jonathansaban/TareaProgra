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
public class Temporizador {
     private int tiempoActual;  
    private Alarma alarma;     
    

    public Temporizador() {
        this.tiempoActual = 0;  
    }


    public void asociarAlarma(Alarma alarma) {
        this.alarma = alarma;
    }


    public void iniciar() {
        while (true) {  
            try {
                Thread.sleep(1000);  
                tiempoActual++;  
                System.out.println("Tiempo actual: " + tiempoActual + " segundos");

               
                if (alarma != null && alarma.haSonado(tiempoActual)) {
                    alarma.activarAlarma();  
                    break; 
                }

            } catch (InterruptedException e) {
                System.out.println("El temporizador fue interrumpido.");
            }
        }
    }

    public int getTiempoActual() {
        return tiempoActual;
    }
    
}
