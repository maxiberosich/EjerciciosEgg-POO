/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo
dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para
calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujaráel rectángulo mediante asteriscos usando 
la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej01.entidades;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        this.base = leer.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextInt();
    }
    
    public int calcularSuperficie(){
        return base * altura;
    }
    
    public int calcularPerimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujaRectangulo(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if((j == 0 || j == this.base-1) || (i==0 || i==this.altura-1)){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
