package com.example.helloworld;

public interface DynamicSquareEmptyProgram {
    public static void main(String[]args){
        int n=5;
         for(int i=1;i<=n;i++)
         {
            System.out.print("*");
         }
               for(int m=3;m<=n;m++)
               {
                  System.out.println();
                  System.out.print("*");
                  for (int l=3;l<=n;l++)
                  {
                  System.out.print(" ");
                  }
                 System.out.print("*");
               }System.out.println();
               for(int r=1;r<=n;r++){
                   System.out.print("*");
        }

    }
}
