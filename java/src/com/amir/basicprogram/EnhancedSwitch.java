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
        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            //
        }
        //
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }
    }
}
