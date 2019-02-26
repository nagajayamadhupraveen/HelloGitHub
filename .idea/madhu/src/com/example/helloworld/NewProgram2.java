package com.example.helloworld;

import java.util.Scanner;

public class NewProgram2 {
    public static void main(String[] args) {
        int n;
        
        Scanner scr1 = new Scanner(System.in);
        System.out.println("enter your number:");
        n = scr1.nextInt();
        n = n % 10;
        if (n == 2||n==3) {

            System.out.println(n+" is available in your given number");


        } else {
            System.out.println("your number is not contain 2");
        }
    }
}