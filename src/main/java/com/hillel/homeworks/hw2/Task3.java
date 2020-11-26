package com.hillel.homeworks.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Introduction
        //The first century spans from the year 1 up to and including the year 100,
        //The second - from the year 101 up to and including the year 200, etc.
        //Task :
        //Given a year, return the century it is in.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int year = sc.nextInt();

        System.out.println(centuryFromYear(year));

    }
    public static int centuryFromYear(int year) {
        int centuryCount = 0;
        while (year > 0){
            year = year - 100;
            centuryCount = centuryCount + 1;
        }
        return centuryCount;
    }
}
