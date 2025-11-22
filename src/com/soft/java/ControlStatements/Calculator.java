package com.soft.java.ControlStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String yn;

       do {
           int num1, num2, result, choice;

           System.out.println("Welcome to Calculator: ");

           System.out.println("1. Addition");
           System.out.println("2. Substraction");
           System.out.println("3. Multiplication");
           System.out.println("4. Division\n");

           Scanner input = new Scanner(System.in);
           System.out.println("Enter your Choice: ");
           choice = input.nextInt();

           System.out.println("Enter any two number: ");
           num1 = input.nextInt();
           num2 = input.nextInt();

           switch (choice) {
               case 1: result =  num1 + num2;
                   System.out.println("Result: "+result);
                   break;
               case 2: result =  num1 - num2;
                   System.out.println("Result: "+result);
                   break;
               case 3: result =  num1 * num2;
                   System.out.println("Result: "+result);
                   break;
               case 4: result =  num1 / num2;
                   System.out.println("Result: "+result);
                   break;
               default:
                   System.out.println("Invalid choice..?");
           }
           System.out.println("Do you want to continue again: Press y for YES n for NO");
           yn = input.next();
       }while (yn.equals("y") || yn.equals("Y"));

        System.out.println("EXIT....!");
    }
}
