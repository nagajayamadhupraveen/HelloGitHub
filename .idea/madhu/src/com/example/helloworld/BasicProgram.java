package com.example.helloworld;

import java.util.Scanner;

public class BasicProgram {
    public static void main(String[]args){
        String str;
        Scanner scr=new Scanner (System.in);
        System.out.println("enter your TEXT:");
        str=scr.nextLine();
        System.out.println(str);
        int n;
        Scanner scr1=new Scanner(System.in);
        System.out.println("enter your number");
        n=scr1.nextInt();


        switch (n){
            case 1:System.out.println("one onezer one");break;
            case 2:System.out.println("one twozer two");break;
            case 3:System.out.println("one threeZer three");break;
            case 4:System.out.println("one fourzer four");break;


        }
        String year;
        Scanner yer=new Scanner(System.in);
        System.out.println("enter your year");
        year=yer.nextLine();
        switch (n){

            case 1:year="now we are in 2018";break;
            case 2:year="now we will move to something";break;
            case 3:year="every thing is going to good";
        }
        System.out.println(year);



        int i,k,age,u;

        Scanner scr2=new Scanner(System.in);
        System.out.println("enter your i value:");
        i=scr2.nextInt();
        Scanner scr3=new Scanner(System.in);
        System.out.println("enter  your k value:");
        k=scr3.nextInt();
        Scanner scr4=new Scanner(System.in);
        System.out.println("enter your age value:");
        age=scr4.nextInt();
        Scanner scr5= new Scanner(System.in);
        System.out.println("ENTER YOUR FOR LOOP VALUE");
        u=scr5.nextInt();


        if(i<k){
            System.out.println("k is begger that to i");
        }else {

            System.out.println("i is begger than to k");
        }


        if (age<i){

            if(i<k){
                System.out.println("you are not good at all programing in age of 22 ");
            }
        }
        else if(age>=i&&age<k){
            System.out.println("age is ok for everything");


            } else if(age<=i&&age>k){
            System.out.println("you are moving on ");

        }
        for(k=i;k<=u;k++){
            System.out.println(u);
            --u;
        }
        do{

            System.out.println(k);
            k++;
        }while (k<u);

        while (k<u){
            System.out.println(k);
            ++k;
        }

        }


    }



