package com.soft.java.ArraysPrograms;

public class PrintMinMax {

    public static void main(String[] args) {

        int[] a = {10,20,30,40,50,60};

//        int max = a[0];
//
//        for (int i = 1; i <a.length ; i++) {
//            if(a[i] > max) {    // 20 > 10
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum element is "+max);

        int min = a[0];

        for (int i = 1; i <a.length ; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Minimum element is "+min);


    }
}
