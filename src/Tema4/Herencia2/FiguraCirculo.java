package Tema4.Herencia2;

public class FiguraCirculo extends Figura {
    double radio;


    public FiguraCirculo(String color, double radio, double pi) {
        super(color);
        this.radio = radio;

    }

   /* public area(double radio, double pi) {

        return 3.14 * (radio * radio);
    }

    public perimetro(double radio, double pi) {

        return 3.14 * radio * 2;
    }
*/

}
