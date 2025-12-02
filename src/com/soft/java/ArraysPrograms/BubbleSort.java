package com.soft.java.ArraysPrograms;

public class BubbleSort {

    public static void main(String[] args) {

//        int[] a = {77,55,33,11,99,22,44,66};
//
//        int temp;
//        for (int i=0; i<a.length; i++) {
//            int flag = 0;
//            for (int j = 0; j <a.length-1-i ; j++) {
//                if(a[j] > a[j+1]) {
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                    flag = 1;
//                }
//            }
//            if (flag == 0) {
//                break;
//            }
//        }
//
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(a[i]);
//        }


        String[] b = {"babu","amar","kunal", "pawan","danish"};
        String tempp;

        for (int i = 0; i <b.length ; i++) {
            int flagg = 0;
            for (int j = 0; j <b.length-1-i; j++) {
                if (b[j].compareTo(b[j+1]) >0) {
                    tempp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = tempp;
                    flagg = 1;
                }
            }
            if (flagg == 0) {
                break;
            }

        }

        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+" ");
        }

    }

}
