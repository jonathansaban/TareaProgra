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
public class MainEstudiante {
    public static void main(String[] args) {
     
        

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "A001", 85);
        Estudiante estudiante2 = new Estudiante("Ana García", "A002", 90);
        Estudiante estudiante3 = new Estudiante("Carlos López", "A003", 50);
        Estudiante estudiante4 = new Estudiante("Laura Martínez", "A004", 75);
        Estudiante estudiante5 = new Estudiante("kevin lopes", "A04504", 61);
        
        Curso cursoProgra = new Curso();

        // Agregar estudiantes al curso
        cursoProgra.agregarEstudiante(estudiante1);
        cursoProgra.agregarEstudiante(estudiante2);
        cursoProgra.agregarEstudiante(estudiante3);
        cursoProgra.agregarEstudiante(estudiante4);
        cursoProgra.agregarEstudiante(estudiante5);

        // Mostrar el promedio del curso
        System.out.println("Promedio del curso: " + cursoProgra.calcularPromedio());

     
        cursoProgra.mostrarEstudiantesAprobados();
        
    }
}

/*  
¿Cómo se encapsulan los datos de los estudiantes dentro del curso?
se encapsulan atravez de declarar los atributos publicos y asi solo tener acceso mediante metodos especificos

¿Cómo se garantiza que las notas sean válidas?
haciendo una validacion en el cual no puden se menor de 0 ni mayor que 100, si se introduce un dato erroneo se le informara atravez de un mensaje

*/
