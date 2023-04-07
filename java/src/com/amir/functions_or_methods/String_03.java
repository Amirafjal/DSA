package com.amir.functions_or_methods;

import java.util.Scanner;

public class String_03 {
    public static void main(String[] args) {

        //String message = greet();
       // System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String naam = in.nextLine();
        String personalisedMessage = greets(naam);

    }

  static String greets(String name){
      System.out.println("Hello , "+name);
        return name;
  }

    static String greet(){
        String greeting = "HI, How are you?";
        return greeting;
    }
}
