package Tema3.ejer1;

public class Rectang {

    int largo;
    int ancho;

    public Rectang() {
        this(5, 10);
    }

    public Rectang(int largo, int ancho) {
        if (largo > 0 && ancho < 0) {
            this.largo = largo;
            this.ancho = ancho;
        } else {
            this.largo = 5;
            this.ancho = 10;
        }
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        if (largo > 0) this.largo = largo;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) this.ancho = ancho;
    }

    public double getPerimetro() {
        return (largo + ancho) * 2;
    }


    public void orientacion() {
        if (ancho == largo) {
            System.out.println("Cuadrado");

        } else if (ancho > largo) {
            System.out.println("Horizontal");

        } else {
            System.out.println("Vertical");

        }
    }

}
