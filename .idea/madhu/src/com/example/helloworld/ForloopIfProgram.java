package com.example.helloworld;

import java.util.Scanner;

public class ForloopIfProgram {
    public static void main(String[]args){
        int i,k,j;
        Scanner scr= new Scanner (System.in);
        System.out.print("Give a value of i:");
        i=scr.nextInt();
        Scanner scr1=new Scanner(System.in);
        System.out.print("please enter a value of k:");
        k=scr1.nextInt();
        Scanner scr2=new Scanner(System.in);
        System.out.print("Assign a value of j:");
        j=scr2.nextInt();

        for(i=k;i<=j;i++){

            for(k=j;k<=i;k++){

                if(j<k){
                    System.out.print("its working good ");
                    if(j<i){

                        System.out.print("its working fine");
                    }
                }
            }
        }
    }
}
