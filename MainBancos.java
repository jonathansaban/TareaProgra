package Ejercicio1;


import Ejercicio1.CuentaBancaria;

public class MainBancos {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("12356879", -22500);
        
        cuenta1.depositar(1500);
    }
}

    /*______________________preguntas________________________
                ¿Qué atributos debería tener la clase?
    los atributos son: 
        -numero de cuenta
        -Saldo

        ¿Cómo se asegura que el saldo no se vuelva negativo?
        En el setter creando una validacion para que no aceptar numeros negativos

    */