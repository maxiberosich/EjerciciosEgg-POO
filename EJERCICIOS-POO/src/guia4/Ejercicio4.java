/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package guia4;

/**
 *
 * @author Max
 */
public class Ejercicio4 {
    private int numero;

    public Ejercicio4() {
    }

    public Ejercicio4(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean primo(int num){
        int cont = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0)
                cont++;
        }
        if (cont > 1)
            return false;
        else
            return true;
    }
}
