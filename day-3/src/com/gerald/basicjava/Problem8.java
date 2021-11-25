package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 8 - Cetak Tabel Perkalian
 */
public class Problem8 {
    static void tabelPerkalian(int angka) {
        for (int row = 1; row <= angka; row++) {
            for (int col = 1; col <= angka; col++) {
                System.out.print(row * col + " ");
                if (row * col < 10) System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int bil = scan.nextInt();
        scan.close();
        System.out.println("Output : ");

        tabelPerkalian(bil);
    }
}