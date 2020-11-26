package com.hillel.homeworks.hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        //Heron's formula to calculate area of triangle: Example: a=3, b=4, c =5 Result: 6.0
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextInt();
        System.out.println("enter b");
        double b = sc.nextInt();
        System.out.println("enter c");
        double c = sc.nextInt();

        double s = triangle(a, b, c);
        System.out.println("result = " + s);
    }
    public static double triangle(double a, double b, double c){
        double p = (a + b + c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return s;
    }

}
