package com.example.helloworld;

public class NumberPalindrome {
    public static void main(String []args){

        int r,sum=0,temp;
        int n=17;
        temp=n;
        while (n>0){

            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("n is a palandrome");
        }else{
            System.out.println("n is a not palandrome");
        }
    }
}
