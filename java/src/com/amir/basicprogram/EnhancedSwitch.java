package com.amir.basicprogram;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("a red sweet fruit");
            case "orange" -> System.out.println("round fruit");
            case "grape" -> System.out.println("small fruit");
            default -> System.out.println("Please Enter a valid fruit");
        }
    }
}
