package com.hillel.homeworks.hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String args[]) {
        //Write a program which finds minimal number in int array
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Min number = " + arr[0]);
    }
}
