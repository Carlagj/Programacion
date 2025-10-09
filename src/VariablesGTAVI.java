public class VariablesGTAVI {
    public static void main(String[] args) {
        long dinero = 1000000000000000000L;
        float saldo = 12345.89f;
        System.out.println(dinero);
        System.out.println(saldo);

        // no se puede encajar decimal en entero
        //int numero = 1000L;
        double numero2 = 457.24;
        double cantidad = -124;

        final int notaFinDeCurso;
        int examen1 = 8;
        double examen2 = 6;
        double media = ( examen1 + examen2) /2;
        System.out.println("La media seria " + media);

        // CASTING
        notaFinDeCurso = (int) media;
        System.out.println("La notaFinalDeCurso seria " + notaFinDeCurso);

        // Caracteres
        char inicial = '6';
        System.out.println("Tu inicial es la");
    }

}
