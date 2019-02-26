package com.example.helloworld;

import java.util.Scanner;

public class StringProgram {


    public static void main(String []args){

        String str="";

        Scanner scr= new Scanner(System.in);
        System.out.println("enter text:");
        str=scr.nextLine();
        switch (str){





            case "ravi":System.out.println("raviteja");

            case "teja":System.out.print("teja");break;
        }

    }
}
