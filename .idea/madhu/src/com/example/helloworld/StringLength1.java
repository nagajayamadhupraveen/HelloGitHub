package com.example.helloworld;

import java.util.Scanner;

public class StringLength1 {
    public static void main(String[]args){
        String a;

        Scanner scr=new Scanner(System.in);
        System.out.println("enter your name");
        a=scr.nextLine();
        int i=0;
        try{
          while(true){
              a.charAt(i);
              i++;
          }

        }catch (StringIndexOutOfBoundsException e){
            System.out.println(i);

        }

    }
}
