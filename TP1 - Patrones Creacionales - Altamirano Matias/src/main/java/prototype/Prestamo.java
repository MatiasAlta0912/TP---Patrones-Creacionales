package main.java.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Prestamo {
    private String libro;
    private String usuario;
    private String fechaInicio;
    private String fechaFin;

    public Prestamo(Prestamo prestamo) {
        this.libro = prestamo.libro;
        this.usuario = prestamo.usuario;
        this.fechaInicio = prestamo.fechaInicio;
        this.fechaFin = prestamo.fechaFin;
    }

    public Prestamo clone() {
        return new Prestamo(this);
    }
}
