package com.example.helloworld;

import java.util.Scanner;

public class WhileloopProgram {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner scr = new Scanner(System.in);
        System.out.println("enter your choise");
        i = scr.nextInt();
        Scanner scr1 = new Scanner(System.in);
        System.out.println("enter your j value");
        j = scr1.nextInt();
        if (i < j) {
            while (i < j) {

                System.out.println(i++);


            }

        } else {
            System.out.println("it's not woring .....error");


        }
    }
}
