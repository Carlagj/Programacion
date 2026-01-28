package Tema3.Seguros;

public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Juan", 30, true, "Bueno");
        Persona persona2 = new Persona("Ana", 22, false, "Excelente");
        Persona persona3 = new Persona("Carlos", 50, true, "Malo");

        System.out.println("Importe del seguro de Juan: $" + persona1.calcularImporteSeguro());
        System.out.println("Importe del seguro de Ana: $" + persona2.calcularImporteSeguro());
        System.out.println("Importe del seguro de Carlos: $" + persona3.calcularImporteSeguro());
    }
}



