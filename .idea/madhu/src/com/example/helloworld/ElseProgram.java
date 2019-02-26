package com.example.helloworld;

import java.util.Scanner;

public class ElseProgram {

    public static void main(String []args){
        int i;
        int k;
        Scanner scr=new Scanner(System.in);
        System.out.print("enter i value:");
        Scanner scr1=new Scanner(System.in);
        System.out.print("enter k value:");

        i=scr.nextInt();
        k=scr1.nextInt();
        if(i<k){
            System.out.println(i+"' is less than "+k);
        }
        else{

            System.out.println(k+"'is greater than to"+ i);
        }
    }
}
