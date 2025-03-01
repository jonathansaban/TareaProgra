package Ejercicio1;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.setSaldo(saldo);
    }
    
    public void depositar(double incremento){
        if (incremento >0 ){
            this.saldo += incremento; 
            System.out.println("su nuevo saldo es de: " + this.saldo);
        } else {
            System.out.println("el valor introducido no es valido");
        }
        
        
    }
    
    public void retirar(double decremento){
        if (decremento <= this.saldo){
            this.saldo -= decremento;
            System.out.println("su nuevo saldo es de: " + this.saldo);
        }   else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("su saldo actual es" + saldo);
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            System.out.println("error no puede crear su cuenta con saldo negativo");
            this.saldo = 0;
        }else{
             this.saldo = saldo;
        }
        
    }

}
