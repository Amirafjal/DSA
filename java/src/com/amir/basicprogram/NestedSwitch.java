package com.amir.basicprogram;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("amir afjal");
                break;
            case 2:
                System.out.println("sonu");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
                break;
            default:
                System.out.println("Enter Correct EmpID");
        }

        //Better way to write
        switch (empID) {
            case 1 -> System.out.println("amir afjal");
            case 2 -> System.out.println("sonu");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter Correct EmpID");
        }
    }
}
