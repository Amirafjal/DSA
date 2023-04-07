package com.amir.functions_or_methods;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(marks);//wrong scope
        System.out.println(num);//wrong scope

        System.out.println(a);//correct scope
        System.out.println(b);//correct scope

    }
    static void random(int marks){
        int num = 68;
        System.out.println(num);//correct scope
        System.out.println(marks);//correct scope

        System.out.println(a);//wrong scopping
        System.out.println(b);//wrong scope
    }
}
