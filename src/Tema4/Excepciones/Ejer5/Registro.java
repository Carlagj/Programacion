package Tema4.Excepciones.Ejer5;

public class Registro {

    public void registrarEdad(int edad) throws EdadInvalidadException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidadException("Edad invalida: " + edad);
        }
        System.out.println("Edad registrada: " + edad);
    }


}
