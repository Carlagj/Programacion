package Tema4.Herencia6;

public class MainRestaurante {
    public static void main(String[] args) {

        Comanda comanda1 = new Comanda(5, 3, 10);
        comanda1.agregarPlato(new Primero("Ensalada", 6.50, true));
        comanda1.agregarPlato(new Carne("Solomillo", 14.00, 1));
        comanda1.agregarPlato(new Pescado("Merluza", 12.00));
        comanda1.agregarPlato(new Postre("Flan", 4.50, true));
        comanda1.agregarPlato(new Postre("Tarta especial", 5.00, true));
        System.out.println(comanda1);
        System.out.println("¿Hay diabéticos? " + comanda1.hayDiabeticosEnLaMesa());


    }
}
