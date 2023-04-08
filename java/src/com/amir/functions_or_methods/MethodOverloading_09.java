package com.amir.functions_or_methods;

public class MethodOverloading_09 {
    public static void main(String[] args) {

        fun(69);
        fun("amir");
        System.out.println(sum(3,5));
        System.out.println(sum(7,8,9));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b , int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
