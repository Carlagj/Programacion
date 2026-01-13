package Tema3.Ejer3;

public class Libro {
    private String titulo;
    private Autor escritor;
    private boolean prestado = false;

    public Libro(Autor escritor, String titulo) {
        this.escritor = escritor;
        this.titulo = titulo;

    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Has alquilado " + titulo);
        } else {
            System.out.println("Error: " + titulo + " No esta disponible");
        }
    }

    public void devolver() {
        prestado = false;
    }

    public void informacion() {
        System.out.println(titulo + " " + escritor.mostrarAutor());
    }

}
