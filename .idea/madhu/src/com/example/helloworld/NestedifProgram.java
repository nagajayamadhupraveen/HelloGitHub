package com.example.helloworld;

import java.util.Scanner;

public class NestedifProgram {
    public static void main(String []args){

        int i,k;

        Scanner scr=new Scanner(System.in);
        System.out.print("enter i value:");
        i=scr.nextInt();
        Scanner scr1=new Scanner(System.in);
        System.out.print("enter k value:");
        k=scr1.nextInt();
        if(i<=10){
               if(k>=12){
                System.out.println("Its working good");
                 }
                  else{
                       System.out.print("its not workin ");
                              }
                   }

                    else {

                      System.out.print("Its working some better ");
        }

    }

}
