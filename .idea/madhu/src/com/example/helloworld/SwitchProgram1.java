package com.example.helloworld;

import java.util.Scanner;

public class SwitchProgram1 {
    public static void main(String[]args) {
        int i;
        Scanner abc = new Scanner(System.in);
        System.out.println("enter your choise:");
        i=abc.nextInt();
       switch (i){


           case 1:System.out.print("madhu");break;
           case 2:System.out.print("praveen");break;
           case 3:System.out.print("Loine");break;
           case 4:System.out.print("OK");break;
           case 5: System.out.print("GOING GOOD");break;
           default:System.out.print("Wrong Choise");
       }
    }
}
