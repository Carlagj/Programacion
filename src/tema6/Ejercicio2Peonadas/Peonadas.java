package tema6.Ejercicio2Peonadas;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Peonadas {

        public static void main(String[] args) {
            Path archivoEntrada = Paths.get("peonadas.txt");

            Map<Integer, Map<String, int[]>> datos = new TreeMap<>();
            String[] nombresMeses = {
                    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
            };

            try {
                List<String> lineas = Files.readAllLines(archivoEntrada);

                for (String linea : lineas) {
                    if (linea.trim().isEmpty()) continue;

                    String[] partes = linea.split(";");
                    String fechaStr = partes[0];

                    String[] fechaPartes = fechaStr.split("/");
                    int mes = Integer.parseInt(fechaPartes[1]) - 1;
                    int anio = Integer.parseInt(fechaPartes[2]);

                    for (int i = 1; i < partes.length; i++) {
                        String nombre = partes[i].trim();

                        datos.putIfAbsent(anio, new TreeMap<>());
                        datos.get(anio).putIfAbsent(nombre, new int[12]);
                        datos.get(anio).get(nombre)[mes]++;
                    }
                }

                for (var entradaAnio : datos.entrySet()) {
                    int anio = entradaAnio.getKey();
                    Path dirAnio = Paths.get(String.valueOf(anio));

                    if (!Files.exists(dirAnio)) {
                        Files.createDirectories(dirAnio);
                    }

                    for (var entradaTrabajador : entradaAnio.getValue().entrySet()) {
                        String nombre = entradaTrabajador.getKey();
                        int[] peonadasMensuales = entradaTrabajador.getValue();

                        String nombreFichero = nombre.replace(" ", "_") + "_" + anio + "_peonadas.txt";
                        Path rutaFichero = dirAnio.resolve(nombreFichero);

                        List<String> contenido = new ArrayList<>();
                        for (int i = 0; i < 12; i++) {
                            contenido.add(nombresMeses[i] + " " + peonadasMensuales[i]);
                        }

                        Files.write(rutaFichero, contenido);
                    }
                }
                System.out.println("Proceso completado con éxito.");

            } catch (IOException e) {
                System.err.println("Error al procesar los archivos: " + e.getMessage());
            }
        }
    }


