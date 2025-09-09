import main.java.abstractfactory.*;
import main.java.builder.Usuario;
import main.java.factory.LibroFactory;
import main.java.factory.LogisticaLibro;
import main.java.prototype.Prestamo;
import main.java.singleton.Database;
import main.java.singleton.Libro;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Singleton
        System.out.println("SINGLETON");
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        Libro libro1 = new Libro(1, "Libro 1");
        database1.agregarLibro(libro1);

        Libro libro2 = new Libro(2, "Libro 2");
        database2.agregarLibro(libro2);

        database2.mostrarLibros();

        //Factory
        System.out.println("FACTORY");
        LibroFactory libroFactoryFisico = LogisticaLibro.crearLibro(1);
        libroFactoryFisico.leer();
        LibroFactory libroFactoryDigital = LogisticaLibro.crearLibro(2);
        libroFactoryDigital.leer();

        //Abstract Factory
        System.out.println("ABSTRACT FACTORY");
        AbstractFactory adminFactory = new AdminFactory();
        InterfazUI adminUI = adminFactory.crearUI();
        MetodoEnvio adminEnvio = adminFactory.crearEnvio();

        adminUI.mostrar();
        adminEnvio.enviar();

        System.out.println();

        AbstractFactory usuarioFactory = new UsuarioFactory();
        InterfazUI usuarioUI = usuarioFactory.crearUI();
        MetodoEnvio usuarioEnvio = usuarioFactory.crearEnvio();

        usuarioUI.mostrar();
        usuarioEnvio.enviar();

        //Builder
        System.out.println("BUILDER");
        Usuario usuario = new Usuario.Builder()
                .nombre("Carlos")
                .email("carlos@gmail.com")
                .direccion("Frederich1234")
                .telefono("261231456")
                .fechaNacimiento("1985-12-10")
                .build();

        System.out.println(usuario);

        //Prototype
        System.out.println("PROTOTYPE");
        Prestamo prestamo1 = new Prestamo("Libro1", "Maria", "28/07/1939", "02/09/1945");
        Prestamo prestamoClon1 = prestamo1.clone();
        Prestamo prestamoClon2 = prestamo1.clone();
        prestamoClon2.setUsuario("Ana");
        prestamoClon2.setFechaFin("06/06/1944");

        System.out.println("Original " + prestamo1);
        System.out.println("Clon 1 " + prestamoClon1);
        System.out.println("Clon 2 " + prestamoClon2);
    }
}