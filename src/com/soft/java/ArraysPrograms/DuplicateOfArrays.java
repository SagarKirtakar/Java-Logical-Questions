package com.soft.java.ArraysPrograms;

public class DuplicateOfArrays {
    public static void main(String[] args) {

        int[] a = {7,5,3,9,1,7,4,5};

        int[] b;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] == a[j]) {
                    b = new int[]{a[i]};
                }
            }
        }


    }
}
