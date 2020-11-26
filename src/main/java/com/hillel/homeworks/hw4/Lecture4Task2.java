package com.hillel.homeworks.hw4;

public class Lecture4Task2 {
    public static void main(String[] args) {
        //Product code validation eg: AX6BYU56UX6CV6BNT7NM
        //287430
        //• 1st part can contain only capital letters and 6 digits. 2nd
        //part is all digits and = the product of the first 6 digits
        //taken in groups of two from the left. Eg 65*66*67 =
        //287430
        String s = "AX6BYU56UX6CV6BNT7NM287430";

        check(s);
    }

    private static void check(String s) {
        char[] charArray = s.toCharArray();
        char[] tempLetters = new char[14];
        char[] tempNum = new char[12];
        int k = 0;
        int g = 0;
        try {
            for (char each : charArray) {
                if (Character.isLetter(each)) {
                    tempLetters[k] = each;
                    k++;
                } else if (Character.isDigit(each)) {
                    tempNum[g] = each;
                    g++;
                }
            }
            String stOneNum = Character.toString(tempNum[0]) + Character.toString(tempNum[1]);
            String stTwoNum = Character.toString(tempNum[2]) + Character.toString(tempNum[3]);
            String stThreeNum = Character.toString(tempNum[4]) + Character.toString(tempNum[5]);
            String stLastNum = Character.toString(tempNum[6]) + Character.toString(tempNum[7]) + Character.toString(tempNum[8]) + Character.toString(tempNum[9]) + Character.toString(tempNum[10]) + Character.toString(tempNum[11]);

            int numLeft = Integer.parseInt(stOneNum) * Integer.parseInt(stTwoNum) * Integer.parseInt(stThreeNum);
            int numRight = Integer.parseInt(stLastNum);

            if (numLeft == numRight) {
                System.out.println(s + " = valid key");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(s + " = invalid key");
        }


    }
}
