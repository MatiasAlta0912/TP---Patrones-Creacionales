package main.java.factory;

public class LibroFactoryDigital implements LibroFactory {
    @Override
    public void leer() {
        System.out.println("Leyendo libro digital");
    }
}
