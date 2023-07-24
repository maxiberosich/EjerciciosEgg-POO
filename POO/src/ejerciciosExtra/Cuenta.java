/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
 */
package ejerciciosExtra;

/**
 *
 * @author Max
 */
public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirarSaldo(double retiro){
        if(retiro > getSaldo()){
            System.out.println("Saldo insuficiente, usted dispone $" + getSaldo() + " vuelva a realizar la operacion nuevamente");
        }else if(retiro < 1){
            System.out.println("Ingreso incorrecto, ingrese nuevamente el monto a retirar");            
        }else{
            setSaldo(getSaldo()-retiro);
            System.out.println("Retiro exitoso, su nuevo saldo en la cuenta es: $" + getSaldo());
        }
    }
}
