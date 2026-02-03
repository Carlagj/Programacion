package Tema4.Herencia2;

public class FiguraCuadrado extends Figura {
    double lado;

    public FiguraCuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

   /* public area(double lado) {
        return (lado * lado);
    }

    public perimetro(double lado) {
        return lado * 4;
    }

*/
}
