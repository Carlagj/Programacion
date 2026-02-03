package Tema4.Herencia;

public class VideojuegoXbox extends Videojuego {

    boolean necesitaGamepass;

    public VideojuegoXbox(String nombre, double precio, boolean necesitaGamepass) {
        super(nombre, precio);
        this.necesitaGamepass = necesitaGamepass;
    }

    public String toString() {
        return super.toString() + (necesitaGamepass ? " y necesita Gamepass" : " y no necesitas Gamepass");
    }
}