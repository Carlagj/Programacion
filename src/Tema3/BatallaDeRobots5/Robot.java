package Tema3.BatallaDeRobots5;

import java.util.Random;

public class Robot {

    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;

    private static Random r = new Random();

    public Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100.0;
        this.potenciaAtaque = r.nextInt(10, 21);
        this.blindaje = r.nextInt(0, 11);

    }

   /* public robotEnemigo(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100.0;
        this.potenciaAtaque = r.nextInt(10, 21);
        this.blindaje = r.nextInt(0, 11);

    }*/

    //Metodos


    public void mostrarEstadisticas() {

        System.out.println("Robot: " + nombre + " " + modelo);
        System.out.println("--------------------------");
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + potenciaAtaque);
        System.out.println("Blindaje: " + blindaje);
        System.out.println();

    }

    public void recibirDano(double cantidad) {
        double danoReal = cantidad - blindaje;
        if (danoReal == 0) {
            System.out.println("El blindaje lo paró todo");
        } else {
            vida -= danoReal;
            if (vida <= 0) {
                vida = 0;
            }
        }
    }

    public void atacar(Robot enemigo) {
        if (!this.estaVivo()) {
            System.out.println("El robot " + nombre + " esta destruido y no puede atacar.");
            return;
        }
        if (!enemigo.estaVivo()) {
            System.out.println("El enemigo ya esta vencido.");
            return;
        }
        enemigo.recibirDano(this.potenciaAtaque);
        System.out.println(nombre + " ataca a " + enemigo.nombre);
    }

    public boolean estaVivo() {
        return vida > 0;
    }


    public String getNombre() {
        return nombre;
    }

    public double getVida() {
        return vida;
    }
}
