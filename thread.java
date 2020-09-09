package sınav;

import java.io.PrintWriter;
import java.util.Scanner;

public class Sınav extends Thread{
    public void run(){
        for (int i = 0; i < 4000; i++) {
            System.out.println("ADINIZ");
            Thread.sleep(10);
            System.out.println("SOYADINIZ");
            Thread.sleep(5);            
            
        }
    }
    public static void main(String[] args) {
        Sınav nes= new Sınav();
        nes.start();
    }



}