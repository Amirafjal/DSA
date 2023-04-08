package com.amir.functions_or_methods;

import java.util.Arrays;

public class VarArgs_08 { //variable length of argument
    public static void main(String[] args) {
        //fun(2,5,89,9,4,3,1,0,6);
        //mix(2,6,"amir","afjal","asfdjkl;");
        demo(2,5,9,898);
        demo("sonu","amir","afjal");

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void mix(int a , int b , String ...i){

        System.out.println(a+" "+b+" "+(Arrays.toString(i)));
    }


    static void fun(int ...v){ //store array of integer or array of string
        System.out.println(Arrays.toString(v));
    }
}
