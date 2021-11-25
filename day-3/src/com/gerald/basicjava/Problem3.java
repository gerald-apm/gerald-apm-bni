package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 3 - Faktor Bilangan
 */
public class Problem3 {
    static void faktorBilangan(int bilangan) {
        int bagi = 1;
        while (bagi <= bilangan) {
            if (bilangan % bagi == 0) {
                System.out.println(bagi);
            }
            bagi++;
        }
    }

    public static void main(String[] args) {
        // With scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int bil = scan.nextInt();
        scan.close();
        System.out.println();
        System.out.println("Output : ");

        faktorBilangan(bil);
    }
}
