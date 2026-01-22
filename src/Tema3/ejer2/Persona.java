package Tema3.ejer2;

import java.util.Random;

/*
Haz una clase llamada Persona que siga las siguientes condiciones:
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
No queremos que se accedan directamente a ellos.
Piensa que modificador de visibilidad es el más adecuado, también su tipo.
Si quieres añadir algún atributo puedes hacerlo.
Se implantarán varios constructores:
Un constructor con el nombre.
Un constructor con el nombre, edad y sexo.
Un constructor con todos los atributos como parámetro, salvo el DNI.
Los métodos que se implementarán son:
calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en m)),
si esta fórmula devuelve un valor menor que 20, el metodo devuelve un -1,
si devuelve un número entre 20 y 25 (incluidos), está en un peso normal, por tanto,
devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso, devuelve un 1.
Te recomiendo que uses constantes para devolver estos valores.
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto,
será H. No sería visible al exterior. Devolverá el carácter correspondiente al sexo.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras y con ese número, calcula su letra correspondiente.
Este metodo será invocado cuando se construya el objeto. No será visible al exterior.
Para calcular el DNI se debe obtener el módulo 23 del número.
Y una vez obtenido, se relaciona el resto con la letra correspondiente:


Métodos set y get de cada atributo.
Ahora, crea una clase principal que haga lo siguiente:
Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior:
El primer objeto utilizará todas las variables.
El segundo objeto utilizará todas las variables menos el peso y la altura.
El último utilizará el constructor que solo dispone del nombre.
Para cada persona se deberá comprobar si está en su peso ideal,
tiene sobrepeso o por debajo de su peso ideal con un mensaje.
También hay que indicar, para cada persona, si es mayor de edad.
Por último, se debe mostrar la información de cada objeto.
NOTA: Deberás utilizar los métodos que consideres oportunos para realizar todas las acciones indicadas.
 */
public class Persona {

    public static final int PESO_BAJO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;


    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        this.generaDNI();
    }


    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.generaDNI();
    }


    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.generaDNI();
    }


    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'H'; // por defecto
        }
    }


    public int calcularIMC() {
        if (altura <= 0) return 0; // Evitar división por cero
        double imc = peso / (altura * altura);
        if (imc < 20) return PESO_BAJO;
        else if (imc <= 25) return PESO_IDEAL;
        else return SOBREPESO;
    }


    public boolean esMayorDeEdad() {
        return edad >= 18;
    }


    private void generaDNI() {
        Random rnd = new Random();
        int numero = 10000000 + rnd.nextInt(90000000); // 8 cifras
        char letra = calcularLetraDNI(numero);
        this.dni = numero + "" + letra;
    }


    private char calcularLetraDNI(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numero % 23;
        return letras.charAt(resto);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + dni +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }
}
