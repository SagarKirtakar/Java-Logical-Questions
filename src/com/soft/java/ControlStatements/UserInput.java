package com.soft.java.ControlStatements;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();

        System.out.println("Enter gender: ");
        char gender = input.next().charAt(0);

        System.out.println("Enter any number: ");
        int num = input.nextInt();

        System.out.println("Enter phno: ");
        long phno = input.nextLong();

        System.out.println("-------------------------------------------------------");

        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Number: "+num);
        System.out.println("Phno: "+phno);




    }
}
