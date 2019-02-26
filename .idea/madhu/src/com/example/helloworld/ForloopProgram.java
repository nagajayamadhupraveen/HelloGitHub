package com.example.helloworld;

import java.util.Scanner;

public class ForloopProgram {
    public static void main (String[]args){

        int i,k,j;

        Scanner scr=new Scanner(System.in);
        System.out.print("enter i value:");
        i=scr.nextInt();
        Scanner scr1=new Scanner(System.in);
        System.out.print("Enter k value:");
        k=scr1.nextInt();
        Scanner scr2=new Scanner(System.in);
        System.out.print("enter j value");
        j=scr2.nextInt();

        for(i=k;i<=k;i++){


            for(k=j;k<=j;k++){

                if(i<j){

                    System.out.print("It's working nothing better"+k);
                }
                else{
                    System.out.print("It's working really bad");
                }


            }

        }


    }
}
