package main.java.factory;

public class LogisticaLibro {
    public static LibroFactory crearLibro(int codigo) {
        return  codigo == 1 ? new LibroFactoryFisico() : new LibroFactoryDigital();
    }
}
