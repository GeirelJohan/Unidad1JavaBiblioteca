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

    //Constructor
    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
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

    //Mostrar el titulo y autor
    public void mostrarInfo(){
        System.out.println("Título:" + this.titulo);
        System.out.println("Autor:" + this.autor);
        System.out.println("Genero:" + this.genero);
    }
}
