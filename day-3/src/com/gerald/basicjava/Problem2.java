package com.gerald.basicjava;

import java.util.Scanner;

/*
    Problem 2 - x dan o
 */
public class Problem2 {
    static boolean xdano (String kata) {
        int hurufX = 0, hurufO = 0;
        for (var kar: kata.toCharArray()) {
            if (kar != ' ') {
                if (kar == 'x') {
                    hurufX++;
                } else if (kar == 'o') {
                    hurufO++;
                }
            }
        }

        return (hurufO == hurufX);
    }
    public static void main(String[] args) {
        // With scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String kata = scan.next();
        scan.close();
        System.out.println("Output : ");

        boolean hasil = xdano(kata);
        System.out.println(hasil);
    }
}
