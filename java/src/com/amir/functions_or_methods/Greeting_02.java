package com.amir.functions_or_methods;

import java.util.Scanner;

public class Greeting_02 {
    public static void main(String[] args) {
        Hellooo();
    }
    static void Hellooo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name : ");
        String name = in.nextLine();
        System.out.println("Saying Hello From Java , " +name);
    }
}
