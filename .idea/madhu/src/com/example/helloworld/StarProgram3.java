package com.example.helloworld;

public class StarProgram3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }

            for (int j = 0; j <= 8 - i; j++) {
                System.out.print("*");
                 }
                System.out.println();
            }
        }
    }



