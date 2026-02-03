package Tema4.Herencia2;

public class FiguraTriangulo extends Figura {
    double base;
    double altura;
    double lado1;
    double lado2;

    public FiguraTriangulo(String color, double base, double altura, double lado1, double lado2) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   /* public area(double base, double altura) {
        return (base * altura / 2);
    }

    public perimetro(double base, double lado1, double lado2) {
        return base + lado1 + lado2;
    }

*/
}
