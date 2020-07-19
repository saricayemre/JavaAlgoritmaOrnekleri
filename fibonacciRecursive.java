package RecursiveExample;

import java.util.Scanner;

public class RecursiveExample {

    public static long fib(long n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Yapmak İStediğiniz İşlemi Seçiniz:\n(1) Dizinin Elemanlarını Görmek\n(2) Dizinin Belirli Elemanını Görmek");
        int secim = giris.nextInt();
        if (secim == 1) {
            System.out.println("Kaç Eleman Görmek İstiyorsunuz:");
            int sayi = giris.nextInt();
            for (int i = 0; i <= sayi; i++) {
                System.out.print(" " + fib(i));
            }
            System.out.println("");
        } else if (secim == 2) {
            long sayi = giris.nextLong();
            System.out.println("Dizinin " + sayi + ". Elemanı= " + fib(sayi));
        } else {
            System.out.println("Hatalı Seçim Yaptınız");
        }

    }

}
