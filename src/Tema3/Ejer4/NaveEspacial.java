package Tema3.Ejer4;

public class NaveEspacial {
    /*
Estamos en el año 2080. La empresa ÁvilaExpress necesita un programa para controlar su flota de naves repartidoras.
1.La Clase NaveEspacial
Atributos (privados):
nombre (String)
combustible (int): Valor entre 0 y 100.
capacidadCarga (double): En toneladas.
enMision (boolean): Indica si la nave está fuera trabajando.

Constructor: Debe recibir el nombre y la capacidadCarga. Al crearse,
el combustible siempre empieza al 100 y enMision siempre es false. Además,
hay otro constructor que recibe sólo el nombre,
ya que normalmente trabajan con un modelo estándar con capacidad para 6 toneladas.
Metodos:
viajar(int distancia): Cada unidad de distancia consume 2 de combustible.
Si tiene combustible suficiente, resta el gasto y pone enMision a true. Si no tiene suficiente, muestra un mensaje:
"Combustible insuficiente para la misión".
repostar(): Pone el combustible al 100 y enMision a false.
mostrarEstado(): Imprime una línea con todos los datos de la nave de forma elegante.
2.    La Clase ControladorFlota
En el metodo main:
Crea un Array para almacenar 3 naves.
Instancia las 3 naves con nombres y capacidades distintas.
Simula la siguiente situación:
Haz que la primera nave viaje una distancia de 30.
Haz que la segunda nave viaje una distancia de 60.
Muestra el estado de todas las naves usando un bucle for o for-each.
Reposta la nave que se quedó sin combustible y vuelve a mostrar su estado.
Muestra cual es la nave que tiene más energía actualmente.
     */


    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.combustible = 100;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this(nombre, 6.0);
    }

    public void viajar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            enMision = true;
        } else {
            System.out.println("Combustible insuficiente para la mision");
        }

    }

    public void repostar() {
        combustible = 100;
        enMision = false;

    }

    public void mostrarEstado() {
        System.out.println(
                "Nave: " + nombre + "| Combustible -> " + combustible + " %" + "| Capacidad -> " + capacidadCarga + " Toneladas " + "| En mision -> " + (enMision ? "Si" : "No"));


    }


}
