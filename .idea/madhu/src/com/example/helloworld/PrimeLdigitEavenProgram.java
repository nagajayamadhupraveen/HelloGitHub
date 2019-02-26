package com.example.helloworld;

import java.util.Scanner;

public class PrimeLdigitEavenProgram {
    public static void main(String[] args) {
        int k, m, c, j, l;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your number");
        k = scr.nextInt();

        c = 1;
        for (int i = 2; i <= k / 2; i++) {
            m = k % i;
            if (m == 0) {
                c = 0;
                 break;
            }
        }
        if (c == 1) {
            System.out.print("Given number is a primenumber" + k);
        } else {
            System.out.print("Given number is not a primenumber" + k);
        }

        if (k % 10 == 1) {

            System.out.print("  This Number consists last digit one" + k);
        } else {
            System.out.print("  This number don't have last digit one" );
        }
        if (k % 10 == 1) {
            if (k <= 9) {
                if (k % 2 == 0) {
                    System.out.print("given number is even");
                } else {
                    System.out.print("  given number is odd");
                }


            } else {
                j = k / 10;
                if (j % 2 == 0) {
                    System.out.print(" Before one number is even number");
                } else {
                    System.out.print(" Befor one number is odd number");
                }
            }
        }
    }
}

