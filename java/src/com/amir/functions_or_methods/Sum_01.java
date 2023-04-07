package com.amir.functions_or_methods;

import java.util.Scanner;

public class Sum_01 {
    public static void main(String[] args) {
        //int ans = summ();
       // System.out.println(ans);
        //anyname();
        //anyname();
       int adding =  sum3(2,4);
        System.out.println(adding);
    }
    static int sum3(int a , int b){
        int add = a+b;
        return add;
    }
    //return the value
    static int summ(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter no 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
       // System.out.println("This will never execute");
    }




    //---------------------------------
    static void anyname(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter no 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = "+ sum);
    }


        /*

        methods or functions in java is like this :::::

        access modifier(we'll look in OOP) return_type name(arguments){
                //body
                return statement;
        }


         */
}
