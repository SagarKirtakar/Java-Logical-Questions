// Program to find Greater between Two or Three Numbers

package com.soft.java.ControlStatements;

public class GreaterOfThree {
    public static void main(String[] args) {

        int a = 100, b = 155, c = 800;

        if(a > b) {
            if(a > c) {
                System.out.println("a is greater");
            }else {
                System.out.println("c is greater");
            }
        } else if(b > c) {
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

        if(a > b && a > c) {
            System.out.println("a is greater");
        } else if(b > c) {
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

    }
}
