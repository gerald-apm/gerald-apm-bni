package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 4 - Bilangan Prima
 */
public class Problem4 {
    static void bilanganPrima (int bil) {
        if (bil == 1 || bil == 0) {
            System.out.println("Bukan Bilangan Prima");
            return;
        }
        int bagi = 2;
        while (bagi < bil) {
            if (bil % bagi == 0) {
                System.out.println("Bukan Bilangan Prima");
                return;
            }
            bagi++;
        }
        System.out.println("Bilangan Prima");
    }

    public static void main(String[] args) {
        // With scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int bil = scan.nextInt();
        scan.close();
        System.out.print("Output : ");
        bilanganPrima(bil);
    }
}
