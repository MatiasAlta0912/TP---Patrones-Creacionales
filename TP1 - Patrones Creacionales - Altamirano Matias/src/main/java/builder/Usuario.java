package main.java.builder;


public class Usuario {
    private final String nombre;
    private final String email;
    private final String direccion;
    private final String telefono;
    private final String fechaNacimiento;

    private Usuario(Builder builder){
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.telefono = builder.telefono;
    }

    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private String fechaNacimiento;

        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder fechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono= '" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
