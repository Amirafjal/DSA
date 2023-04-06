package com.amir.basicprogram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        type casting
        int num = (int)10.708f;
        System.out.println(num);

//        automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a; // 257 % 256 = 1
        System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int d = x*y/z;

        System.out.println(d);

        int number = 'A';
        System.out.println(number); //java promoting itself to ascii value

        //((((google unicode value in java?)))))

        System.out.println(3*6.739f); // float * int gives the float

        byte w = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double k = 0.1234;
        double result = (f*w) + (i / c) - (k*s);
        // float + int - double = double
        System.out.println((f*w) +" "+ (i / c)  +" "+ (k*s));
        System.out.println(result);








    }
}
