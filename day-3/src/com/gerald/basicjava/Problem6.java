package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 6 - Exponentiation
 */
public class Problem6 {
    static int exponentialBil(int angka, int pangkat) {
        if (pangkat == 0) return 1;
        return angka * exponentialBil(angka, pangkat-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x (bilangan) : ");
        int bil = scan.nextInt();
        System.out.print("n (pangkat) : ");
        int pang = scan.nextInt();
        scan.close();
        System.out.print("Output : ");

        System.out.println(exponentialBil(bil, pang));
    }
}
