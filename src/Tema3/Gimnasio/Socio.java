package Tema3.Gimnasio;

public class Socio {

    static int contadorSocios;

    private String nombre;
    private int id;

    public Socio(String nombre) {
        this.nombre = nombre;
        contadorSocios++;
        this.id = contadorSocios;

    }

    public static int getContadorSocios() {
        return contadorSocios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
