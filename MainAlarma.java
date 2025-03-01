

package Ejercicio4;


public class MainAlarma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Alarma alarma = new Alarma(5);
        
       
        Temporizador temporizador = new Temporizador();
        
      
        temporizador.asociarAlarma(alarma);
        
        
        temporizador.iniciar();
    }
    /*
    ¿Cómo interactúan las clases Temporizador y Alarma?
    funcionan atraves de que alarma recibe un dato de tipo temporizador y al momento de que se cumpla el parametro se activa la alarma
    
    ¿Cómo se asegura que los atributos sean accesibles solo mediante métodos específicos?
    atravez de los setters y getters, ya que son metodos especificos para acceder a los atributos encapsulados
    
    */
    
}
