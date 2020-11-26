package com.hillel.homeworks.hw4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lecture4Task1 {
    public static void main(String args[]) {
        //Write a class StringUtils which has one static method
        //randomString. This method takes two params: String type
        //and int length.
        //• Method would return new string of given length and
        //containing random symbols of given type.
        //• Types: alpha (only letters), numeric (only numbers),
        //alphanumeric ([a…z & 0..9]

        StringUtils stringUtils = new StringUtils();
        StringBuilder s = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("choose type of symbols to creat random text: ");
        System.out.println(" 1 = alpha (only letters)");
        System.out.println(" 2 = numeric (only numbers)");
        System.out.println(" 3 = alphanumeric ([a…z & 0..9])");
        System.out.println(" enter only num to choose: ");

        int check = 0;
        String types = "";

        try {
            check = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("error of input");
        }

        if (check == 1) {
            types = "alpha";
        } else if (check == 2) {
            types = "numeric";
        } else if (check == 3) {
            types = "alphanumeric";
        } else {
            System.out.println("error choose");
            return;
        }

        System.out.println("enter number of symbols to creat random text: ");
        int textnum = 0;
        try {
            textnum = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("error of input");
        }

        s = stringUtils.randomString(types, textnum);
        System.out.println(s);
    }
}

class StringUtils {
    String type;
    int length;

    public StringUtils() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public StringBuilder randomString(String type, int length) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        char[] letterArr = new char[2 * letters.length()];
        char[] numArr = new char[numbers.length()];
        char[] symbols = new char[2 * letters.length() + numbers.length()];
        for (int i = 0; i < letters.length(); i++) {
            char[] temp = letters.toCharArray();
            symbols[i] = temp[i];

        }
        int g = 0;
        for (int i = letters.length(); i < 2 * letters.length(); i++) {
            char[] temp = letters.toUpperCase().toCharArray();
            symbols[i] = temp[g];

            g++;
        }
        int k = 0;
        for (int i = 2 * letters.length(); i < 2 * letters.length() + numbers.length(); i++) {
            char[] temp = numbers.toCharArray();
            symbols[i] = temp[k];
            k++;
        }
        for (int i = 0; i < numbers.length(); i++) {
            char[] temp = numbers.toCharArray();
            numArr[i] = temp[i];

        }

        for (int i = 0; i < letters.length(); i++) {
            char[] temp = letters.toCharArray();
            letterArr[i] = temp[i];

        }
        int y = 0;
        for (int i = letters.length(); i < 2 * letters.length(); i++) {
            char[] temp = letters.toUpperCase().toCharArray();
            letterArr[i] = temp[y];
            y++;
        }

        char[] arrIn = new char[length];

        StringBuilder sb = new StringBuilder();

        if (type.equals("alpha")) {
            for (int i = 0; i < arrIn.length; i++) {
                Random r = new Random();
                int temp = (r.nextInt(letterArr.length));
                arrIn[i] = letterArr[temp];
                String s = String.valueOf(arrIn[i]);
                sb.append(s);

            }
        } else if (type.equals("numeric")) {
            for (int i = 0; i < arrIn.length; i++) {
                Random r = new Random();
                int temp = (r.nextInt(numArr.length));
                arrIn[i] = numArr[temp];
                String s = String.valueOf(arrIn[i]);
                sb.append(s);

            }
        } else if (type.equals("alphanumeric")) {
            for (int i = 0; i < arrIn.length; i++) {
                Random r = new Random();
                int temp = (r.nextInt(symbols.length));
                arrIn[i] = symbols[temp];
                String s = String.valueOf(arrIn[i]);
                sb.append(s);

            }
        }

        return sb;
    }
}
