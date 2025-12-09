package Ejersnv;

public class Ejer3 {
    public static void main(String[] args) {
        StringBuilder num = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            num.append(i);
            if (i < 10) num.append("-");
        }
        System.out.println(num);
    }
}
