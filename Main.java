package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 3;
        int target = (int) (Math.random() * 10);
        System.out.println(target);
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Bir sayı giriniz : ");
            int value = Integer.parseInt(s.next());
            if (target == value){
                System.out.println("Tebrikler!!! KAZANDINIZ...");
                break;
            }
            else{
                if(count == 2){
                    System.out.println("Maalesef Yanlış :( SON HAKKINIZ!!!!");
                }
                else {
                    System.out.println("Maalesef Yanlış :( " + (count-1) + " hakkınız kaldı!");
                }
                count--;
            }
        }while(count != 0);
    }
}