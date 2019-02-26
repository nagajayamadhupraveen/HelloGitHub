package com.example.helloworld;

import java.util.Scanner;

public class SwitchIntProgram {
    public static void main(String[]args){
        int range=0;
        String work="";
        Scanner man=new Scanner(System.in);
        System.out.println("enter your range?");
        range=man.nextInt();
        switch (work) {

            case "beginer":range=1;break;
            case "normal":range=2;break;
            case "wellperson":range=3;break;
            default:range=4;
        }
System.out.println("Your range"+range);
        }
    }

