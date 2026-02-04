package Tema4.Herencia6;

public class MainRestaurante {
    public static void main(String[] args) {

        comanda comanda = new comanda(5, 3, 10, true);
        comanda.agregarPlato(new primero("Ensalada", 6.50, true));
        comanda.agregarPlato(new carne("Solomillo", 14.00, 1));
        comanda.agregarPlato(new pescado("Merluza", 12.00));
        comanda.agregarPlato(new postre("Flan", 4.50, false));
        comanda.agregarPlato(new postre("Tarta especial", 5.00, true));
        System.out.println(comanda);
        System.out.println("¿Hay diabéticos? " + comanda.hayDiabeticosEnLaMesa());


    }
}
