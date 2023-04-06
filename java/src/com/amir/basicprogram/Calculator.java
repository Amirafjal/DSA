package com.amir.basicprogram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter operator : ");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%' ){
                System.out.println("Enter 1st num : ");
                int num1 = in.nextInt();
                System.out.println("Enter 2nd num : ");
                int num2 = in.nextInt();

                if(ch == '+'){
                    ans = num1 + num2;
                }
                if(ch == '-'){
                    ans = num1 - num2;
                }
                if(ch == '/'){
                    if ( num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(ch == '*'){
                    ans = num1 * num2;
                }
                if(ch == '%'){
                    ans = num1 % num2;
                }
            }else if(ch == 'X' || ch == 'x'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println("Value is "+ans);
        }
    }
}
