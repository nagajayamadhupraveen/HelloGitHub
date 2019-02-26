package com.example.helloworld;

public class ExchangingProgram {

    public static void main(String []args){
        int y=4,x=28,k,l;
        x=y+x;
        y=x-y;
        x=x-y;

        System.out.println(y);
        System.out.println(x);

    }
}
