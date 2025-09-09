package main.java.abstractfactory;

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar() {
        System.out.println("Envío express en proceso...");
    }
}