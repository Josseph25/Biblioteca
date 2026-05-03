/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {

        // COLECCIÓN DE CATEGORÍAS
        ArrayList<Categoria> categorias = new ArrayList<>();

        Categoria ficcion = new Categoria("Ficcion");
        Categoria tecnologia = new Categoria("Tecnologia");

        // USO NORMAL
        ficcion.agregarLibro(new Libro("Don Quijote", "Cervantes", "L001"));

        // USO DE SOBRECARGA
        tecnologia.agregarLibro("Java Basico", "Oracle", "L002");
        tecnologia.agregarLibro("POO en Java", "Deitel", "L003");

        // AGREGAR CATEGORÍAS
        categorias.add(ficcion);
        categorias.add(tecnologia);

        // LISTAR TODO
        for (Categoria c : categorias) {
            c.listarLibros();
        }

        // PRUEBA DE ERROR (NULL)
        ficcion.agregarLibro(null);
    }
}