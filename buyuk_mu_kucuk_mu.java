package buyuk_mu_kucuk_mu;

import java.util.Scanner;

public class buyuk_mu_kucuk_mu {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        char harf;
        int kucukSayi = 0, buyukSayi = 0;
        char kucukHarf[] = new char[30];
        char buyukHarf[] = new char[30];
        for (int i = 0; i < 30; i++) {
            harf = giris.next().charAt(0);
            if (harf >= 'a' && harf <= 'z') {
                kucukHarf[kucukSayi] = harf;
                kucukSayi++;
            } 
            else if (harf >= 'A' && harf <= 'Z') {
                buyukHarf[buyukSayi] = harf;
                buyukSayi++;
            }

        }

    }

}
