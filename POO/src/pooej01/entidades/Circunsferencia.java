/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package pooej01.entidades;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Circunsferencia {
    private double radio;
    
    public Circunsferencia(){
        
    }
    
    public Circunsferencia(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void crearCircunsferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la radio de la circunsferencia a crear: ");
        this.radio = leer.nextDouble();
    }
    
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
