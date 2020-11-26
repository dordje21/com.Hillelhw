package com.hillel.homeworks.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age = sc.nextInt();

        String s = descriptionAge(age);
        System.out.println(s);
    }

    private static String descriptionAge(int age) {
        if(age<=12){
            return "Ты - ребенок";
        } else if (age>=13 && age<=17){
            return "Вы - подросток";
        } else if (age>=18 && age<=64){
            return "Вы - взрослый";
        } else if(age>=65){
            return "Вы - пожилой человек";
        }
        return null;
    }
}
