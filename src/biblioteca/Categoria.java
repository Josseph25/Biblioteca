/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private ArrayList<Libro> libros;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // =========================
    // COLECCIONES + MANEJO DE ERRORES
    // =========================
    public void agregarLibro(Libro libro) {
        try {
            if (libro == null) {
                throw new Exception("El libro no puede ser nulo");
            }
            libros.add(libro);
            System.out.println("Libro agregado correctamente");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // =========================
    // SOBRECARGA DE MÉTODO
    // =========================
    public void agregarLibro(String titulo, String autor, String codigo) {
        try {
            Libro nuevo = new Libro(titulo, autor, codigo);
            libros.add(nuevo);
            System.out.println("Libro agregado por sobrecarga");
        } catch (Exception e) {
            System.out.println("Error en sobrecarga: " + e.getMessage());
        }
    }

    public void listarLibros() {
        System.out.println("\nCategoria: " + nombre);
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados");
        } else {
            for (Libro l : libros) {
                l.mostrarInfo();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}