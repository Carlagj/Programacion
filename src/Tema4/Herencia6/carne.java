package Tema4.Herencia6;

public class carne extends plato {
    private String coccion;


    public carne(String nombre, double precio, int opcion) {
        super(nombre, precio);
        validarcocion(opcion);
    }


    public void validarcocion(int opcion) {
        switch (opcion) {
            case 1:
                coccion = "Poco hecho";
                break;
            case 2:
                coccion = "Al punto";
                break;
            case 3:
                coccion = "Muy hecho";
                break;
            case 4:
                coccion = "Carbonizado";
                break;
            default:
                coccion = "No seleccionó el punto de la carne";
        }
    }


    public String toString() {
        return "Carne: " + super.toString() + " La Coccion de la carne es: " + coccion;
    }
}
