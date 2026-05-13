/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1;

/**
 *
 * @author Geirel
 */
public class Main {
    public static void main(String[]arg) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        Libro l1 = new Libro("El principito", "Antonie de Saint-Exupery", Genero.INFANTIL);
        Libro l2 = new Libro("Breves respuestas a las grandes preguntas", "Stephen Hawking", Genero.CIENCIA);
        Libro l3 = new Libro("Dracula", "Bram Stoker", Genero.TERROR);
        Libro l4 = new Libro("The Hunger Games", "Suzane Collins", Genero.FICCION);
        
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);
        
        biblioteca.listarLibros();
        System.out.println("Libros creados: " + Libro.getContadorLibros());
        
        //Respuestas de la Actividad
        System.out.println("--------------------------------------------------");
        System.out.println("         Respuestas de la Actividad \n1-El id no se puede modificar por que este es solo\npara identificar un libro (objeto) de manera unica");
        System.out.println("--------------------------------------------------");
        System.out.println("2-Si se cambia una variable final me da un error\nde java ya que esta asociada con el id y no lo\npuedo modificar");
        System.out.println("--------------------------------------------------");
    }
}
