package Explicaciones;

public class operadorTernario {
    public static void main(String[] args) {

        boolean tengoefectivo = false;
        boolean tengotarjeta = true;

        String puedopagar = tengoefectivo && tengotarjeta ? "si" : "no" ;
        System.out.println("puedo pagar " + puedopagar);

    }
}
