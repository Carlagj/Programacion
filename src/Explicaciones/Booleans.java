package Explicaciones;

public class Booleans {
    public static void main(String[] args) {

        boolean TengoDinero = true;
        boolean tengoUnaHoraLibre = true;

        System.out.println(TengoDinero && tengoUnaHoraLibre);

        tengoUnaHoraLibre = false;

        System.out.println(TengoDinero && tengoUnaHoraLibre);
        boolean tengoefectivo = false;
        boolean tengotarjeta = true;
        System.out.println("puedo pagar: " + (tengoefectivo || tengotarjeta));

        boolean hagoejercicios = true;
        System.out.println("hagoejercicios: " + hagoejercicios);
        System.out.println("hagoejercicios: " + !hagoejercicios);
    }
}
