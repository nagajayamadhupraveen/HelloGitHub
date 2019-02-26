package com.example.helloworld;

import java.util.Scanner;

public class StringLength {
    public static void main(String[]args){
        String s;
        Scanner scr=new Scanner(System.in);
        System.out.println("ENTER YOUR WORD:");
        s=scr.nextLine();
        System.out.println(s.length());

    }
}
