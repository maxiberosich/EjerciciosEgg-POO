/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase
"Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package ejerciciosExtra;

/**
 *
 * @author Max
 */
public class RectanguloArea {
    private int lado1;
    private int lado2;

    public RectanguloArea() {
    }

    public RectanguloArea(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public int calcularArea(){
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Hola mundo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
    
}
