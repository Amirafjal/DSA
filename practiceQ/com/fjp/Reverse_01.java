package com.fjp;

import java.util.Scanner;

public class Reverse_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int dig = 0;
        while(n !=0 ){
            int quo = n / 10;
            int rem = n % 10;
            n = quo;
            dig = rem;
            System.out.println(dig);


        }
    }
}
