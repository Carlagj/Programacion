public class Operadores {
    public static void main(String[] args)  {
        // Operadores aritmeticos
        /*
            Entrada numero
            Salida numero
         */
        int numero1 = 13;
        numero1 = numero1 + 2;
        numero1 = numero1 * 2;
        numero1 = numero1 -50 / 2;
        System.out.println("numero1 vale " + numero1);
        numero1 = numero1 + 5;

        // Ahora numero1 vale 10
        int numero2 = numero1 % 3;

        System.out.println(numero2);

        // Operadores de asignacion
        int otroNumero = 3;
        otroNumero -= 2;
        System.out.println("otronumero " + otroNumero);

        // operadores de incremento
        int edad = 22;
        System.out.println("Edad1: " + edad);
        edad++;
        System.out.println("Edad2: " + edad);
        System.out.println("Edad3: " + ++edad);
        System.out.println("Edad4: " + edad);
    }
}
