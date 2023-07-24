/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de
"más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces
que cada jugador ha ganado.
 */
package ejerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Juego {
    private int numero;
    private int intentos;
    
    public Juego(){
        
    }
    
    public Juego(int numero, int intentos){
        this.numero = numero;
        this.intentos = intentos;
    }

    /**
     * 
     * @return 
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    /**
     * 
     * @return true or false
     */
    public boolean iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("1º jugador inserte un numero que deba adivinar el 2º jugador");
        this.setNumero(leer.nextInt());
        System.out.println("ingrese la cantidad de oportunidades que tendra el 2º jugador de acertar el numero");
        this.setIntentos(leer.nextInt());
        System.out.println("2º jugador, ahora es tu turno de adivinar");
        do { 
            int num = leer.nextInt();
            if(num == this.getNumero()){
                System.out.println("Adivinaste papu!!");
                break;
            }else if(num < this.getNumero()){
                System.out.println("El numero ingresado es mas bajo");
            }else{
                System.out.println("El numero ingresado es mas alto");
            }
            this.intentos--;
        } while (this.getIntentos() != 0);
        if(this.getIntentos() == 0){
            System.out.println("Lo lamento, no adivinaste ya que el numero era: " + this.numero + " :3");
            return false;
        }else{
            return true;
        }
    }
}
