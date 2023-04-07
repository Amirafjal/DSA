package com.amir.functions_or_methods;

public class Swap_04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

//        int temp =a ;
//        a = b;
//        b = temp;
//        System.out.println(a+ " "+b);
        swap(a,b);
        System.out.println("main method : "+a +" "+b);

    }
    static void swap(int num1 , int num2){

        int temp = num1;
        num1 = num2;
        num2 = temp;

       // System.out.println("swap method : "+num1+ " " +num2);
    }

}
