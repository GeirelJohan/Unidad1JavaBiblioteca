/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1;

/**
 *
 * @author Geirel
 */
public class Libro {
    //Atributos privados (encapsulación)
    private String titulo;
    private String autor;
    private Genero genero;
    private static int contadorLibros = 0;
    private final int id;

    //Constructor
    public Libro(String titulo, String autor, Genero genero) {
        this.id = contadorLibros + 1;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        contadorLibros++;
    }

    //Metodos de acceso (getters y setters)
    //Titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //Autor
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Genero
    public Genero getGenero() {
        return genero;
    }
    public void setGenero (Genero genero) {
        this.genero = genero;
    }
    //ContadorLibros
    public static int getContadorLibros() {
        return contadorLibros;
    }
    //ID
    public int getId() {
        return id;
    }

    //Mostrar el titulo y autor
    public void mostrarInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println("Id: " + this.id);
    }
}
