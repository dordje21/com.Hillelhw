package com.hillel.homeworks.hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String arg[]) {
        //Write a program which calculates the sum of two columns.
        //Print table with results if columns have the same size (col_1
        //| col_2 | sum). Otherwise print which column has bigger size
        int[][] arr = new int[10][3];
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                arr[i][2] = arr[i][0] + arr[i][1];
                 System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }

        for (int i = 0; i < arr.length; i++) {
                result1 += arr[i][0];
                result2 += arr[i][1];
        }
        System.out.println("sum 1 col = " + result1 + "; sum 2 col = " + result2 + ";");
        if(result1 > result2){
            System.out.println("coll 1 is bigger = " + Math.max(result1, result2));
        } else {
            System.out.println("coll 2 is bigger = " + Math.max(result1, result2));
        }

    }
}
