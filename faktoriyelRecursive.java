package RecursiveExample;

import java.util.Scanner;

public class RecursiveExample {

    public static int Faktoriyel(int sayi) {
        
        if (sayi >= 1) 
            return sayi * Faktoriyel(sayi - 1);
         
        else 
            return 1;
        
    }
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz!");
        int sayi = giris.nextInt();
        System.out.println("Girilen Sayının Faktöriyeli= " + Faktoriyel(sayi));

    }

}
