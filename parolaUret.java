package parolaUret;

import java.util.Scanner;

public class parolaUret {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kaç Karekterlik Parola Üretmek İstiyorsunuz?");
        int sayi = giris.nextInt();
        String parola = "";
        char dizi[] = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z', 'q', 'x', 'w',
            'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M', 'N', 'O', 'Ö', 'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z', 'Q', 'X', 'W',
            '!', '^', '+', '-', '*', '/', '?', '=', '&', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < sayi; i++) {
            parola += dizi[(int) (83 * Math.random())];
        }
        System.out.println("Oluştutulan Parola= " + parola);
    }

}
