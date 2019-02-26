package com.example.helloworld;

import java.util.Scanner;

public class SwitchMonthProgram {
    public static void main(String[]args){
        int good ;
        String str="";
        Scanner month=new Scanner(System.in);
        System.out.print("enter str number:");
        good=month.nextInt();
        switch (good){

            case 1:str="january";break;
            case 2:str="february";break;
            case 3:str="march";break;
            case 4:str="April";break;
            case 5:str="may";break;
            case 6:str="june";break;
            case 7:str="july";break;
            case 8:str="August";break;
            case 9:str="september";break;
            case 10:str="October";break;
            case 11:str="november";break;
            case 12:str="December";break;
            case 20:str="Monday";break;
            case 21:str="Tuesday";break;
            case 22:str="Wednesday";break;
            case 23:str="Thursday";break;
            case 24:str="Friday";break;
            case 25:str="Saturday";break;
            case 26:str="Sunday";break;
            default:System.out.print("wrong choise");
        }
         System.out.println(str);
    }
}
