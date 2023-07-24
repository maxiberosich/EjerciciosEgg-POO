/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, 
Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
número de páginas.
 */
package pooej01.entidades;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public void cargarDatosLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca el ISBN del libro: ");
        this.setISBN(leer.nextInt());
        System.out.print("Introduzca el titulo del libro: ");
        leer.nextLine();
        this.setTitulo(leer.nextLine());
        System.out.print("Introduzca el autor del libro: ");
        this.setAutor(leer.nextLine());
        System.out.print("Introduzca la cantidad de paginas del libro: ");
        this.setNumeroDePaginas(leer.nextInt());
    }
    
    public void mostrarDatosLibro(){
        System.out.println("Datos del libro " + this.getTitulo() + ":");
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Cantidad de paginas: " + this.getNumeroDePaginas());
        System.out.println("ISBN: " + this.getISBN());
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    
    
}
