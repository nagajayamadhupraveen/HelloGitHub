package com.example.helloworld;

import java.util.Scanner;

public class ForloopProgramSpring {

    public static void main(String[]args){
        String str;
        boolean i;
        char t;
        Scanner scr=new Scanner(System.in);
        System.out.print("enter your name:");
        str=scr.nextLine();
        Scanner scr1=new Scanner(System.in);
        System.out.print("enter your boolean:");
        i=scr1.nextBoolean();
        Scanner scr2=new Scanner(System.in);
        System.out.print("enter A latter:");
         t = scr2.next(".").charAt(0);


         for(int n=4;n<=4;n++){
             for(int d=2;d<=4;d++){

                 if(i){
                     System.out.println("working some good"+" "+str+" "+t);

                 }
                 else {
                     System.out.println("boolean is working");
                 }

             }

         }
    }
}
