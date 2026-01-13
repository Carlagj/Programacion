package Tema3.ejerrepaso;

public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public double aprobar() {
        if (nota < 5) {
            nota = 5;
        }
        return nota;
    }

    public void imprimir() {
        System.out.println(nombre + "tiene de nota : " + nota);
    }


}
