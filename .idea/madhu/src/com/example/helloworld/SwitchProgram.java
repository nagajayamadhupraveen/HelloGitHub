
package com.example.helloworld;

import java.util.Scanner;

public class SwitchProgram {

    public static void main(String[]args){



         int number;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your number:");
        number=scan.nextInt();


        switch (number){
            case 1: System.out.println("ravi teja");break;
            case 2:System.out.println("madhu");break;
            default:System.out.print("wrong choise");
        }
    }
}
