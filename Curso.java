
package Ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author DELL GP
 */
public class Curso {
    
    private ArrayList<Estudiante> estudiantes; 

    public Curso() {
        this.estudiantes = new ArrayList<>(); 
    }


    public void agregarEstudiante(Estudiante estudiantenuevo) {
        estudiantes.add(estudiantenuevo);
    }


    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            return 0; 
        }

        double sumaNotas = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
        Estudiante estudianteP = estudiantes.get(i);  
        sumaNotas += estudianteP.getNotaFinal();
        }

        return sumaNotas / estudiantes.size();  
    }


        public void mostrarEstudiantesAprobados() {
        System.out.println("Estudiantes aprobados:");
        for(int i = 0; i < estudiantes.size(); i++){
            Estudiante estudiantePosicion = estudiantes.get(i);
            if(estudiantePosicion.getNotaFinal() >= 61){
                System.out.println("nombre: " + estudiantePosicion.getNombre() + "nota: " +estudiantePosicion.getNotaFinal() );
            }
        }
    
    }
    
    
}
