package Repaso;

import java.util.Arrays;

public class Ejer5 {
    public static void main(String[] args) {
        int[] a = {3, 3, 3};
        int[] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b[0] = 8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int[] c = {1, 2, 3};
        int[] d = {1, 2, 3};
        System.out.println(c == b);
        System.out.println(c.equals(d));
        System.out.println(Arrays.equals(c, d));

    }
}
