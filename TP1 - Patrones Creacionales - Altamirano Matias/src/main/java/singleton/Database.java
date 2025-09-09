package main.java.singleton;

import java.util.ArrayList;
import java.util.List;

public final class Database {
    private static Database instance;
    private List<Libro> libros = new ArrayList<>();

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> mostrarLibros() {
        System.out.println(this.libros);
        return this.libros;
    }
}

