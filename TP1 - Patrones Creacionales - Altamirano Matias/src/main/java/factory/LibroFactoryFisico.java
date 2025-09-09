package main.java.factory;

public class LibroFactoryFisico implements LibroFactory {
    @Override
    public void leer() {
        System.out.println("Leyendo libro fisico");
    }
}
