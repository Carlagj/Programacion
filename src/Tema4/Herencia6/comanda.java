package Tema4.Herencia6;

public class comanda {
    private int numeroMesa;
    private int comensales;
    private plato[] platos;
    private int contador;
    private boolean requiereMenuDiabetico;

    public comanda(int numeroMesa, int comensales, int cantidad, boolean requiereMenuDiabetico) {
        this.numeroMesa = numeroMesa;
        this.comensales = comensales;
        this.platos = new plato[cantidad];
        this.contador = 0;
        this.requiereMenuDiabetico = requiereMenuDiabetico;
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
        if (!requiereMenuDiabetico) return true;

        for (int i = 0; i < contador; i++) {
            if (!platos[i].esAptoParaDiabeticos()) {
                return false;
            }
        }
        return true;

    }
}
