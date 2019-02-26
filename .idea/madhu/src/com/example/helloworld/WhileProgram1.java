package com.example.helloworld;

import java.util.Scanner;

public class WhileProgram1 {
    public static void main(String[]args){
      int i;
      int j;
        Scanner scr=new Scanner(System.in);
        System.out.println("enter your i value");
        i=scr.nextInt();
        Scanner scr1=new Scanner(System.in);
        System.out.println("Enter your j value");
        j=scr1.nextInt();
            Scanner input = new Scanner(System.in);


            double[] numbers = new double[i];

            for ( i = j; i < numbers.length; i++)
            {

                numbers[i] = input.nextDouble();
                System.out.println("Please enter number");
            }
        }
    }

