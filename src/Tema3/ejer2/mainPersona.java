package Tema3.ejer2;

import java.util.Scanner;

public class mainPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Pedir datos por teclado
        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce sexo (H/M): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.print("Introduce peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Introduce altura en metros: ");
        double altura = sc.nextDouble();
        // Crear objetos
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre);
        // Array para iterar
        Persona[] personas = {persona1, persona2, persona3};
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            // Comprobar IMC
            int imc = p.calcularIMC();
            switch (imc) {
                case Persona.PESO_BAJO:
                    System.out.println(p.getNombre() + " está por debajo de su peso ideal.");
                    break;
                case Persona.PESO_IDEAL:
                    System.out.println(p.getNombre() + " está en su peso ideal.");
                    break;
                case Persona.SOBREPESO:
                    System.out.println(p.getNombre() + " tiene sobrepeso.");
                    break;
            }
            // Comprobar mayoría de edad
            if (p.esMayorDeEdad()) {
                System.out.println(p.getNombre() + " es mayor de edad.");
            } else {
                System.out.println(p.getNombre() + " no es mayor de edad.");
            }
            // Mostrar información completa
            System.out.println(p.toString());
            System.out.println("---------------------------");
        }
        sc.close();

    }
}
