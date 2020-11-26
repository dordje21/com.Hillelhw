package com.hillel.homeworks.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weight in kg (90):");
        weight = sc.nextDouble();
        System.out.println("enter height in cm (190):");
        height = sc.nextDouble();

        System.out.println(calculateBmi(weight, height, bmi));
    }

    public static String calculateBmi(double weight, double height, double bmi) {
        bmi = weight / (Math.pow(height / 100, 2));

        if (bmi <= 25.0) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        } else if (bmi > 30) {
            return "Obese";
        }
        return null;
    }
}
