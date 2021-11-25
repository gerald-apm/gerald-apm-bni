package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 1 - Vokal dan Konsonan
 */
public class Problem1 {
    static void vokalKonsonan(String kata) {
        int vokal = 0, konsonan = 0, karakter = 0;
        kata = kata.toLowerCase();
        for (var huruf: kata.toCharArray()) {
            if (huruf != ' ') {
                if ((((int) huruf >= 97) && ((int) huruf <=122))) {
                    if (((huruf == 'a') || (huruf == 'i') || (huruf == 'u') || (huruf == 'e') || (huruf == 'o'))) {
                        vokal++;
                    }
                    else {
                        konsonan++;
                    }
                }
                karakter++;
            }
        }

        System.out.println("Jumlah Vokal : " + vokal);
        System.out.println("Jumlah Konsonan : " + konsonan);
        System.out.println("Jumlah Karakter : " + karakter);
    }
    public static void main(String[] args) {
        // With scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String kata = scan.next();
        scan.close();
        System.out.println("Output : ");
        vokalKonsonan(kata);
        System.out.println();
    }
}
