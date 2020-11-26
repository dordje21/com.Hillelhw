package com.hillel.homeworks.hw1;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Task3 {
    public static void main(String args[]) {
        //You are given real numbers a, b and c, where a ≠ 0.
        //   Solve the quadratic equation and output all of its roots in ascending order.
        //   Sample Input 1:
        Scanner sc = new Scanner(System.in);
        double a = 0;
        while (a==0) {
            System.out.println("enter a != 0");
            a = sc.nextInt();
        }
        System.out.println("enter b");
        double b = sc.nextInt();
        System.out.println("enter c");
        double c = sc.nextInt();

        double d = discreminant(a, b, c);
        if (d < 0) {
            System.out.println("result: discreminant < 0! no results");
        } else if (d == 0) {
            System.out.println("result: discreminant = 0 you have only one result" + x(a,b));
        } else {
            double x1 = x1(a, b, d);
            double x2 = x2(a, b, d);
            System.out.println("result: " + Math.min(x1,x2) + " " + Math.max(x1,x2));
        }

    }

    public static double discreminant(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        return d;
    }
    public static double x(double a, double b) {
        double x = -(b/(2*a));
        return x;
    }

    public static double x1(double a, double b, double d) {
        double x1 = (-b - sqrt(d)) / (2 * a);
        return x1;
    }

    public static double x2(double a, double b, double d) {
        double x2 = (-b + sqrt(d)) / (2 * a);
        return x2;
    }

}