package com.example.helloworld;

import java.util.Scanner;

public class NestedSwitchProgram {
    public static void main(String[]args){
        int collegeYear;
        char branch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("collage year:");
        System.out.println("branch:");
        collegeYear=scanner.nextInt();
        branch= scanner.next().charAt(0);;
        switch (collegeYear){

            case 1:System.out.println("English,Maths,PHYSICS");break;
            case 2:
                switch (branch){


                    case 'C':System.out.print("BIOLOGY,MATHS,CHMISTRY");break;
                    case 'M':System.out.print("Fluid mechanics,Mechanics,Aerospace engineering");break;
                    case 'E':System.out.print("Electronics,MoTORS,Fluids");break;


                }
                break;

            case 3:
                switch (branch){


                    case 'C':System.out.print("BIOLOGY,MATHS");break;
                    case 'M':System.out.print(" mechanicsAerospace engineering");
                    case 'E':System.out.print("Fluids");break;


                }
                break;


            case 4:


                switch (branch){


                    case 'C':System.out.print("CHMISTRY");break;
                    case 'M':System.out.print("Mechanics,Aerospace engineering");
                    case 'E':System.out.print("Electronics");break;


                }
                break;


        }


    }
}
