package com.example.helloworld;


import java.util.Scanner;

public class PrimeNumberProgram {
    public static void main(String args[]) {
        int k;
        Scanner scr= new Scanner(System.in);          // % = reminder(below),side value(cof)
        System.out.println("enter your number");
        k=scr.nextInt();
        for (int i = 2; i <=k; i++) {
            int c = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c = 0;
                    break;
                }

            }
            if (c == 1) {
                System.out.println(i+ "is primenumber");

            }

            }

        }



    }
