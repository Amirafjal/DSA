package com.amir.basicprogram;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int num = 0; num <= 5; num+=1) {
            System.out.println(num);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some value : ");

        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
          //  System.out.print(i +" ");
            System.out.print("amir ");
        }


        //while loops
        int d = 1;
        while(d<=5){
            System.out.println(d);
            d+=1;
        }

        //do while
        int l =1;
        do{
            System.out.println(l);
            l++;
        } while (l<=5);



    }
}
