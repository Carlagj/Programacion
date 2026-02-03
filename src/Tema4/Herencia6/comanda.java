package Tema4.Herencia6;

public class comanda {
    private int numeroMesa;
    private int comensales;
    private plato[] platos;
    private int contador;
    private boolean hayDiabeticos;

    public comanda(int numeroMesa, int comensales, int cantidad, boolean hayDiabeticos) {
        this.numeroMesa = numeroMesa;
        this.comensales = comensales;
        this.platos = new plato[cantidad];
        this.contador = 0;
        this.hayDiabeticos = hayDiabeticos;
    }


    public void agregarPlato(plato plato) {
        if (contador < platos.length) {
            platos[contador] = plato;
            contador++;
        }

    }


    public void coste() {

    }

    public void hayDiabeticosEnLaMesa() {

    }
}
