package com.example.helloworld;

import java.util.Scanner;

public class StringPalandrome {
    public static void main(String []args){

        String original,reverse="";
        Scanner scr =new Scanner(System.in);
        System.out.println("enter your string name");
        original=scr.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--){

            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("String is a palandrome");
        }else {
            System.out.println("String is a not palandrome ");
        }
    }

}
