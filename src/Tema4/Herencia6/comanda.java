package Tema4.Herencia6;

public class comanda {
    private int numeroMesa;
    private int comensales;
    private plato[] platos;
    private int contador;


    public comanda(int numeroMesa, int comensales, int cantidad) {
        this.numeroMesa = numeroMesa;
        this.comensales = comensales;
        this.platos = new plato[cantidad];
        this.contador = 0;
    }


    public void agregarPlato(plato plato) {
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
            if (!(platos[i] instanceof  postre)) {
                postre postre = (postre) platos[i];
                if (postre.esAptoParaDiabeticos()) {}
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
