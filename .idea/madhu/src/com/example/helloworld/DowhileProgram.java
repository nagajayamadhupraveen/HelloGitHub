package com.example.helloworld;

import java.util.Scanner;

public class DowhileProgram {
    public static void main(String []args){
        int n;
        boolean r ;
        Scanner scr1=new Scanner (System.in);
        System.out.println("entr your value:");
        n=scr1.nextInt();
        Scanner scr2=new Scanner(System.in);
        System.out.println("enter your boolean value");
        r=scr2.hasNextBoolean();
        Scanner scr9=new Scanner(System.in);
        System.out.println("enter your");
        if(n<8) {
            if (r) {
                do {
                    System.out.println(n);
                    n++;
                } while (n <= 10);
            }
        }
    }
}

