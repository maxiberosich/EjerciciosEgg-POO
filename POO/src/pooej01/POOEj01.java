/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import ejerciciosExtra.Cocina;
import ejerciciosExtra.Cuenta;
import ejerciciosExtra.Empleado;
import ejerciciosExtra.Juego;
import ejerciciosExtra.Puntos;
import ejerciciosExtra.RectanguloArea;
import java.util.Scanner;
import pooej01.entidades.Circunsferencia;
import pooej01.entidades.Libro;
import pooej01.entidades.Mascota;
import pooej01.entidades.Operacion;
import pooej01.entidades.Rectangulo;


/**
 *
 * @author Max
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /*Mascota m1 = new Mascota("Juan","Jojo","Chimpance");
        System.out.println(m1);*/
        
        /*Libro libro1 = new Libro();
        libro1.cargarDatosLibro();
        libro1.mostrarDatosLibro();*/
        
        /*Circunsferencia circulo = new Circunsferencia();
        circulo.crearCircunsferencia();
        System.out.println("El area del circulo es: " + circulo.area());
        System.out.println("El perimetro del circulo es: " + circulo.perimetro());*/
        
        /*Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicacion: " + operacion.multiplicar());
        System.out.println("Division: " + operacion.dividir());
        System.out.println("Suma: " + operacion.sumar());*/
        
        /*Rectangulo cuadrao = new Rectangulo();
        cuadrao.crearRectangulo();
        System.out.println(cuadrao.calcularPerimetro());
        System.out.println(cuadrao.calcularSuperficie());
        System.out.println("----El rectangulo que usted ingreso seria el siguiente----");
        cuadrao.dibujaRectangulo();*/
        
        /*Puntos distancia = new Puntos();
        distancia.crearPuntos();
        distancia.mostrarCoordenadasIngresadas();
        System.out.println("La distancia entre las coordenadas es: " + distancia.calcularDistancia());*/
        
        /*Juego ok = new Juego();
        int cantidadDeJuegosGanados = 0;
        do {            
            if (ok.iniciarJuego()) {
                cantidadDeJuegosGanados++;
            }
            System.out.println("Desea continuar? s/n");
        } while (leer.next().toLowerCase().equals("s"));
        System.out.println("-------------------------------------------------");
        System.out.println("Cantidad de veces que acerto el 2º jugador: " + cantidadDeJuegosGanados);*/
        
        /*Cocina receta = new Cocina();
        System.out.println("Cantidad de recetas que ingresara");
        int rec = leer.nextInt();
        for (int i = 0; i < rec; i++) {
            System.out.println( (i + 1) + "º receta: ");
            receta.agregar();
        }
        receta.mostrarRecetas();
        receta.buscarRecetaPorNombre();*/
        
        //SE PUEDE MEJORAR
        /*Cuenta retiro = new Cuenta("Maxi",30000);
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        retiro.retirarSaldo(leer.nextDouble());*/
        
        //SE PUEDE MEJORAR
        /*Empleado empleado = new Empleado("Juan", 25, 15000);
        System.out.println("El nuevo salario del empleado " + empleado.getNombre() + " va a ser de: $" + empleado.calcularSalario());*/
        
        RectanguloArea area = new RectanguloArea(4,6);
        do {            
            System.out.println("Ingrese el lado 1");
            area.setLado1(leer.nextInt());
            System.out.println("Ingrese el lado 2");
            area.setLado2(leer.nextInt());
            System.out.println("El area del rectangulo de " + area.getLado1() + "X" + area.getLado2() + " es de " + area.calcularArea());
            System.out.println("Desea finalizar el programa? \n1-SI 2-NO");
        } while (leer.nextInt() > 1);        
        
        
    }
    
}
