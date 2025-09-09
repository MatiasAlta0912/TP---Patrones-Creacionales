package main.java.abstractfactory;

public class UsuarioUI implements InterfazUI {
    @Override
    public void mostrar() {
        System.out.println("Mostrando UI de Usuario");
    }
}