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
        
        Libro l1 = new Libro("El principito", "Antonie de Saint-Exupéry", Genero.INFANTIL);
        Libro l2 = new Libro("Breves respuestas a las grandes preguntas", "Stephen Hawking", Genero.CIENCIA);
        
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        
        biblioteca.listarLibros();
        System.out.println("Libros creados: " + Libro.getContadorLibros());
    }
}
