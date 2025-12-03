package Repaso;

public class Ejer6 {
    public static void main(String[] args) {
        int[][] notas = new int[2][3];
        notas[0][0] = 9;
        notas[0][1] = 7;
        notas[0][2] = 6;

        notas[1][0] = 9;
        notas[1][1] = 8;
        notas[1][2] = 7;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {

                System.out.println("notas[" + i + "][" + j + "]=" + notas[i][j]);
            }
        }


    }
}
