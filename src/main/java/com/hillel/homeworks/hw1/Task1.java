package com.hillel.homeworks.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){
        //Using following make a program to calculate logarithm of b with the base of a

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextInt();
        System.out.println("enter b");
        double b = sc.nextInt();
        System.out.println("result = " + logarithm(a, b));

        sc.close();
    }
    public static double logarithm(double a, double b){
        double logA10 = Math.log10(a);
        double logB10 = Math.log10(b);
        double result = logB10 / logA10;
        return result;
    }

}
