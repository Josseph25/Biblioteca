/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class Libro {
    private String titulo;
    private String autor;
    private String codigo;

    public Libro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo +
                ", Autor: " + autor +
                ", Codigo: " + codigo);
    }

    public String getTitulo() {
        return titulo;
    }
}
