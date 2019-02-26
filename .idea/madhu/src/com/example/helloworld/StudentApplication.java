package com.example.helloworld;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        int age;
        char grade;
        double marks;
        int idnumber;
        String name, name1, name2;

        boolean result;

        Scanner scr = new Scanner(System.in);
        System.out.println("enter your age");
        age = scr.nextInt();
        Scanner scr1 = new Scanner(System.in);
        System.out.println("enter your 9th grade:");
        grade = scr1.next(".").charAt(0);
        Scanner scr2 = new Scanner(System.in);
        System.out.println("enter your 9th marks:");
        marks = scr2.nextDouble();
        Scanner scr3 = new Scanner(System.in);
        System.out.println("enter your previous id number:");
        idnumber = scr3.nextInt();
        Scanner scr4 = new Scanner(System.in);
        System.out.println("enter your Full name:");
        name = scr4.nextLine();
        Scanner scr5 = new Scanner(System.in);
        System.out.println("enter your Father name:");
        name1 = scr5.nextLine();
        Scanner scr6 = new Scanner(System.in);
        System.out.println("enter your mother name");
        name2 = scr5.nextLine();



          switch (age){

              case 1:if(age<=15){
                  System.out.println("YOU ARE ELIGIBLE");
              }
              else{
                  System.out.println("YOU ARE NOT ELIGIBLE");
              }
          }
                    if (age <= 15) {


                        if (marks > 5) {
                            System.out.println("your seat conformed" + "  " + "please check your details");
                            System.out.println("your age:" + " " + age);
                            System.out.println("your marks:" + " " + marks);
                            System.out.println("your grade:" + " " + grade);
                            System.out.println("your idnumber:" + " " + idnumber);
                            System.out.println("your name:" + " " + name);
                            System.out.println("your father name:" + " " + name1);
                            System.out.println("your mother name:" + " " + name2);
                        } else {
                            System.out.println("you won't get seat in this School");
                            System.out.println("your marks is very poor :" + " " + marks);
                            System.out.println("Tahnks for consulting");
                        }

                    }

                else {
                    System.out.println("your  age is huge");
                    System.out.println("you are not eligible to studying 10th class");
                }
            }

        }
