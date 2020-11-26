package com.hillel.homeworks.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time please:");
        int time = sc.nextInt();
        double liters = 0.5;
        double result = time * liters;

        System.out.println("time = "+ time + " ---> liters = " + Math.floor (result));
    }
}
