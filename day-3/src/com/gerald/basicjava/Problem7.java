package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 7 - Play with asterisk
 */
public class Problem7 {
    static void printAsterisk(int baris) {
        for (int row = 0; row < baris; row++) {
            for (int col1 = baris; col1 >= row; col1--) {
                System.out.print(" ");
            }
            for (int col2 = 0; col2 <= row; col2++) {
                System.out.print("* ");
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

        printAsterisk(bil);
    }
}
