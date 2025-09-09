package main.java.singleton;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Libro {
    private String nombre;
    private int codigo;

    public Libro(int codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
}
