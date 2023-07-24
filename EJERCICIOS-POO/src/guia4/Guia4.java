/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //EJERCICIO 1
        /*System.out.println("Ingrese dos numeros");
        Ejercicio1 calcular = new Ejercicio1(leer.nextInt(), leer.nextInt());
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println(calcular.getPrimerNumero() + " + " + calcular.getSegundoNumero() + " = " + calcular.sumar());
                    break;
                case 2:
                    System.out.println(calcular.getPrimerNumero() + " - " + calcular.getSegundoNumero() + " = " + calcular.restar());
                    break;
                case 3:
                    System.out.println(calcular.getPrimerNumero() + " * " + calcular.getSegundoNumero() + " = " + calcular.multiplicar());
                    break;
                case 4:
                    System.out.println(calcular.getPrimerNumero() + " / " + calcular.getSegundoNumero() + " = " + calcular.dividir());
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("¿Desea realizar otra operación? S/N");
        }while(leer.next().toLowerCase().equals("s"));*/
        
        //EJERCICIO 2
        /*System.out.print("Cuantas personas desea ingresar: ");
        int n = leer.nextInt();
        int cont = 1;
        Ejercicio2 vector[] = new Ejercicio2[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la " + (i + 1) + "º persona");
            leer.nextLine();
            String nom = leer.nextLine();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            vector[i] = new Ejercicio2(nom, edad);
        }
        for (Ejercicio2 persona : vector) {
            System.out.println((cont) + "º persona:");
            System.out.println(persona.toString());
            if (cont < n) {
                System.out.println("¿Desea ver otro usuario? S/N");
                if (!leer.next().toLowerCase().equals("s")) {
                    break;
                }
            }
            cont++;
        }*/
        
        //EJERCICIO 3
        /*Ejercicio3 convertir = new Ejercicio3();
        System.out.println("El resultado es: " + convertir.conversor());*/
        
        //EJERCICIO 4
        Ejercicio4 primos = new Ejercicio4();
        int opc;
        do {            
            System.out.println("Ingrese un numero para saber si es primo");
            primos.setNumero(leer.nextInt());
            if(primos.primo(primos.getNumero())){
                System.out.println("El numero " + primos.getNumero() + " es primo");
            }else{
                System.out.println("El numero " + primos.getNumero() + " NO es primo");
            }
            System.out.println("Desea introducir otro numero? \n 1-Si \n 2-No");
            opc=leer.nextInt();
        } while (opc < 2);
        
    }
}
