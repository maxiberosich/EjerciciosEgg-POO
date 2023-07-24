/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia4;

/**
 *
 * @author Max
 */
public class Ejercicio2 {
    private String nombre;
    private int edad;

    public Ejercicio2() {
    }

    public Ejercicio2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\n edad = " + edad;
    }
    
    
}
