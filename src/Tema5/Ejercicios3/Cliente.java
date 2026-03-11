package Tema5.Ejercicios3;

public class Cliente {

    private int codCliente;
    private String nombre;
    private String apellido;
    private String direcion;
    private String email;

    public Cliente(int codCliente, String nombre, String apellido, String direcion, String email) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direcion = direcion;
        this.email = email;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "codCliente=" + codCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direcion='" + direcion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
