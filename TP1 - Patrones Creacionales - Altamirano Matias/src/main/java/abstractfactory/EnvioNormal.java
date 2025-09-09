package main.java.abstractfactory;

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar() {
        System.out.println("Envío normal en proceso...");
    }
}