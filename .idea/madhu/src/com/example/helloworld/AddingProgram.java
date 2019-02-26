package com.example.helloworld;

import java.util.Scanner;

public class AddingProgram {

    public static void main(String[]args){
        int i,k,r=0,u=0,y=0,m=0,p,n=0;
        Scanner scr=new Scanner(System.in);
        System.out.println("enter your value");
        i=scr.nextInt();
        //its working good for second time checking git
        while (i>0){

            r=i%10;
            i=i/10;
            u=u+r;
            //y=u+r

            if(u>10){
                while(u>0){
            m=u%10;
            u=u/10;
            u=u+m;
        }
        System.out.println(u);
        }
        }
        System.out.println(u);
    }
}
