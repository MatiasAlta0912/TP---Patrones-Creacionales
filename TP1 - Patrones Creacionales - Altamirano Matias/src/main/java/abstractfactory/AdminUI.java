package main.java.abstractfactory;

public class AdminUI implements InterfazUI {
    @Override
    public void mostrar() {
        System.out.println("Mostrando UI de Administrador");
    }
}