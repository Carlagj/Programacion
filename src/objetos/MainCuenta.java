package objetos;

public class MainCuenta {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        System.out.println("Saldo inicial: " + cuenta.saldo());

        cuenta.imposicion(50);
        System.out.println("Después de ingresar 50 €: " + cuenta.saldo());

        cuenta.reintegro(20);
        System.out.println("Después de retirar 20 €: " + cuenta.saldo());

        cuenta.reintegro(40);
        System.out.println("Después de retirar 40 €: " + cuenta.saldo());
    }
}
