package objetos;

public class Cuenta {
    
    private double saldo;


    public Cuenta() {
        this.saldo = 1.0;
    }


    public double saldo() {
        return saldo;
    }

    public void imposicion(double cantidad) {
        saldo += cantidad;
    }


    public void reintegro(double cantidad) {
        saldo -= cantidad;
    }
}


