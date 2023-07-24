/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta".
Luego, crea métodos para agregar nuevas recetas a la lista, para buscar 
una receta por nombre y para obtener la lista de recetas que se pueden 
preparar con los ingredientes disponibles en la cocina.
 */
package ejerciciosExtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Cocina {
    private List<String> receta;

    public Cocina() {
        this.receta = new ArrayList<>();
    }

    public List<String> getReceta() {
        return receta;
    }

    public void setReceta(List<String> receta) {
        this.receta = receta;
    }
    
    public void agregar(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Nombre: ");
        receta.add("Nombre: " + leer.nextLine());
        System.out.print("Ingredientes: ");
        receta.add("Ingredientes: " + leer.nextLine());
        System.out.print("Preparacion: ");
        receta.add("Preparacion: " + leer.nextLine());
    }
    
    public void buscarRecetaPorNombre(){
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre de la receta que desea buscar");
        nombre = leer.nextLine();
        for(String element: receta){
            if(receta.indexOf("Nombre: " + nombre) >= 0){
                System.out.println("La receta se encuentra en la lista, en la posicion " + receta.indexOf("Nombre: " + nombre));
                break;
            }else{
                System.out.println("No se encuentra la receta en la lista");
                break;
            }
        }
    }
    
    public void mostrarRecetas(){
        System.out.println("--------------------------------------------------");
        for(String elemento: receta){            
            System.out.println(elemento);            
        }
        System.out.println("--------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Cocina{" + "receta=" + receta + '}';
    }

    
    
    
}
