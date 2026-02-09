package Tema4.Herencia6;

public class Comanda {
    private int numeroMesa;
    private int comensales;
    private Plato[] platos;
    private int contador;


    public Comanda(int numeroMesa, int comensales, int cantidad) {
        this.numeroMesa = numeroMesa;
        this.comensales = comensales;
        this.platos = new Plato[cantidad];
        this.contador = 0;
    }


    public void agregarPlato(Plato plato) {
        if (contador < platos.length) {
            platos[contador] = plato;
            contador++;
        } else {
            System.out.println("error: no puede agregar mas platos a esta comanda");
        }
    }


    public double coste() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += platos[i].getPrecio();
        }

        return total;
    }

    public boolean hayDiabeticosEnLaMesa() {
        for (int i = 0; i < contador; i++) {
            if (!(platos[i] instanceof Postre)) {
                Postre postre = (Postre) platos[i];
                if (postre.esAptoParaDiabeticos()) {
                }
                return true;
            }
        }
        return false;

    }

    public String toString() {
        String resultado = "Mesa: " + numeroMesa +
                "\nComensales: " + comensales +
                "\nPlatos:\n";

        for (int i = 0; i < contador; i++) {
            resultado += " - " + platos[i].toString() + "\n";
        }

        resultado += "Total: " + coste() + "€";
        return resultado;
    }


}
