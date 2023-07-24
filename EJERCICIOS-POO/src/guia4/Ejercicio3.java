/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Ejercicio3 {
    private final double libra = 0.86;
    private final double dolar = 1.28611;
    private final double yen = 129.852;
    private double pesos;

    public Ejercicio3() {
    }

    public Ejercicio3(double pesos) {
        this.pesos = pesos;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    
    public double conversor(){
        Scanner leer = new Scanner(System.in);
        String opc;
        System.out.println("Ingrese la cantidad de dinero a convertir");
        this.setPesos(leer.nextDouble());
        System.out.println("Ingrese el nombre del tipo de cambio:");
        System.out.println("Dolar \n Libra \n Yen");
        opc = leer.next();
        switch (opc.toLowerCase()) {
            case "dolar":
                return this.getPesos() * this.dolar;
            case "libra":
                return this.getPesos() * this.libra;
            case "yen":
                return this.getPesos() * this.yen;
            default:
                System.out.println("Opcion no valida");
                return 0;
        }
        
        
            
    }
}
