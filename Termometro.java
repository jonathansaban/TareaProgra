/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author DELL GP
 */
public class Termometro {
    private double gradosC;
    
    public Termometro(double gradosC){
        this.gradosC = gradosC;
    }
    
    
    public void convertirAF(){
        double gradosF = (gradosC * 1.8) + 32;
        
        System.out.println("los " + this.gradosC + " grados Celsius equivalen en Fahrenheit a: " + gradosF );
    }

    public void convertirAK(){
        double gradosK = gradosC + 273.15;
        
        System.out.println("los " + this.gradosC + " grados Celsius equivalen en Kelvin a: " + gradosK );

    }    
        
    public double getGradosC() {
        return gradosC;
    }

    public void setGradosC(double gradosC) {
        this.gradosC = gradosC;
    }
    
    
}
