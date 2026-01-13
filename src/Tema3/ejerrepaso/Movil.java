package Tema3.ejerrepaso;

public class Movil {
    String marca;
    int bateria;
    boolean estaBloqueado;


    public Movil() {
        this("Generico", 100);


    }

    public Movil(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    public void llamar() {

        System.out.println(" llamando..");
    }


}
