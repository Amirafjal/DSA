package com.amir.basicprogram;

import java.util.Scanner;

public class DotEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        if (fruit.equals("mango")){
            System.out.println("king of fruit");
        }
        if (fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }
    }
}
