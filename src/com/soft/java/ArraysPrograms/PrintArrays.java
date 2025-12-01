package com.soft.java.ArraysPrograms;

public class PrintArrays {
    public static void main(String[] args) {

        int[] a= {10,20,30,40,50,60}; // 1-D Array

//        for (int i=0; i<a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//
//        System.out.println();
//
//        int ii = 0;
//        while(ii<a.length) {
//            System.out.print(a[ii]+" ");
//            ii++;
//        }
//
//        System.out.println();
//
//        for (int b : a) {
//            System.out.print(b+" ");
//        }

        int[][] b = {{10,20,30,40,},{50,60,70,80}};   // 2-D Array

//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }

        int[][][] c= {{{10,20,30},{40,50,60},{70,80},{90,100}}};

//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j <c[i].length ; j++) {
//                for (int k = 0; k <c[i][j].length ; k++) {
//                    System.out.print(c[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//        }

        int[][][][] d= {{{{10,20,30},{40,50,60},{70,80},{90,100}}}};

        for (int i = 0; i <d.length ; i++) {
            for (int j = 0; j <d[i].length ; j++) {
                for (int k = 0; k <d[i][j].length ; k++) {
                    for (int l = 0; l <d[i][j][k].length ; l++) {
                        System.out.print(d[i][j][k][l]+" ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
