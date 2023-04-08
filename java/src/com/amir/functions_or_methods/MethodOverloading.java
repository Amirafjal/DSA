package com.amir.functions_or_methods;

public class MethodOverloading {
    public static void main(String[] args) {

        fun(69);
        fun("amir");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
