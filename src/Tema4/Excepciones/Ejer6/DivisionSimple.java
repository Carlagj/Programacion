package Tema4.Excepciones.Ejer6;

public class DivisionSimple {
    public static void realizarDivision(String numerador, String denominador) {

        try {
            int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            if (den == 0) throw new ArithmeticException("El denominador no puede ser cero");

            double division = (double) num / den;
            System.out.println("La division es: " + division);


        } catch (NumberFormatException e) {
            System.out.println("Los numeros no estan en formato correcto");


        } catch (ArithmeticException e) {
            System.out.println("No podemos realizar la division: " + e.getMessage());


        }
    }
}
