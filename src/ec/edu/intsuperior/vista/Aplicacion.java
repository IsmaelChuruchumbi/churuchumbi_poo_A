
package ec.edu.intsuperior.vista; 

import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Autor;

public class Aplicacion {
    public static void main(String[] args) {
        Punto p1=new Punto(-1,7); 
        Punto p2=new Punto ();
        Bicicleta b1=new Bicicleta();
        Bicicleta b2=new Bicicleta(15, "tundra", 156,56, 56, "azul");
        Autor au1=new Autor("123456789", "carlos", "flores", "escritor", "10/02/2002");
        Libro l1=new Libro("la belleza en la programacion", "int", au1);
        Biblioteca biblio=new Biblioteca(45.0f, 55, l1, "Cayambe");
        
        System.out.println("Cordenada x del punto 1: "+p1.getX());
        System.out.println("Cordenada y del punto 1: "+p1.getY()); 
        System.out.println("El autor del libro 1 es "+l1.getAutor().getNombre());
        System.out.println("");
    }
         
    
}
