/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package guia4;

/**
 *
 * @author Max
 */
public class Ejercicio1 {
    private int primerNumero;
    private int segundoNumero;
    
    public Ejercicio1(){
        
    }
    
    public Ejercicio1(int primerNumero, int segundoNumero){
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    
    public int sumar(){
        return primerNumero + segundoNumero;
    }
    
    public int restar(){
        return primerNumero - segundoNumero;
    }
    
    public int multiplicar(){
        return primerNumero * segundoNumero;
    }
    
    public float dividir(){
        return primerNumero / segundoNumero;
    }
}
