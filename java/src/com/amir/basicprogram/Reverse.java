package com.amir.basicprogram;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reverse = 0;
        while(n > 0){
            int remainder = n % 10;
            reverse = (reverse*10) + remainder;
            n = n / 10;

        }
        System.out.println(reverse);
    }
}
