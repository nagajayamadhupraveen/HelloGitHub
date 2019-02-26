package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateStatement {
    public static void main(String[]args){
        String st;

        Scanner scr=new Scanner(System.in);
        System.out.println("enter your statement:");
        st=scr.nextLine();
        String []ar=st.split("\\s");
        Map<String,Integer>mp=new HashMap<String,Integer>();
        int count=0;

        for(int i=0;i<ar.length;i++){
            count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    count++;
                }
            }

            mp.put(ar[i],count);
        }
            System.out.println(mp);
    }
}
