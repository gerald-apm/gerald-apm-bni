package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 5 - Palindrome
 */
public class Problem5 {
    static void palindromeCheck(String kata) {
        char[] kars = kata.toCharArray();
        for (int a1 = 0; a1 < kars.length/2; a1++) {
            if (kars[a1] != kars[(kars.length-1)-a1]) {
                System.out.println("Bukan palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        // With scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String kata = scan.next();
        scan.close();
        System.out.print("Output : ");

        palindromeCheck(kata);
    }
}
