package sınav;

import java.io.PrintWriter;
import java.util.Scanner;

public class Sınav {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac = 0;
        PrintWriter nes = new PrintWriter("A.dat");
        for (;;) {
            String s = k.next();
            if (s.charAt(0) == 'A' || s.charAt(0) == 'a') {
                sayac++;
                nes.println(s);
                if (sayac == 20) {
                    System.exit(0);
                }
            }

        }
    }

}