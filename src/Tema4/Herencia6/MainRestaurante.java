package Tema4.Herencia6;

public class MainRestaurante {
    public static void main(String[] args) {

        comanda comanda1 = new comanda(5, 3, 10, true);
        comanda1.agregarPlato(new primero("Ensalada", 6.50, true));
        comanda1.agregarPlato(new carne("Solomillo", 14.00, 1));
        comanda1.agregarPlato(new pescado("Merluza", 12.00));
        comanda1.agregarPlato(new postre("Flan", 4.50, true));
        comanda1.agregarPlato(new postre("Tarta especial", 5.00, true));
        System.out.println(comanda1);
        System.out.println("¿Hay diabéticos? " + comanda1.hayDiabeticosEnLaMesa());


    }
}
