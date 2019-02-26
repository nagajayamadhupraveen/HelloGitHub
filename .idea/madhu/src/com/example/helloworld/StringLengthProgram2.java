package com.example.helloworld;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringLengthProgram2 {

    public static void main(String []args){

        Map<String, Integer> wordcheck = new TreeMap<String, Integer>();
        String string1;
        Scanner scr= new Scanner(System.in);

        System.out.println("enter your Sentance ");
        string1=scr.nextLine();
        String m;
        Scanner scr1=new Scanner(System.in);
        System.out.println("enter which  word occurences do you want to know ");
        m=scr1.nextLine();



        String string2[]=string1.split(" ");


        for (int i=0; i<string2.length; i++)

        {
            String string=string2[i];
            wordcheck.put(string,(wordcheck.get(string) == null?1:   (wordcheck.get(string)+1)));

        }

        System.out.println(wordcheck);


    }
    }

