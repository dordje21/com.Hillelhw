package com.hillel.homeworks.hw4;

public class Lecture4Task0 {
    public static void main(String arg[]){
        //Write a program which reverts given word
        String text = "simple word";
        System.out.println(revers(text));
    }

    public static String revers(String text) {
        char[] array = text.toCharArray();
        int begin = 0;
        int end = text.length()-1;
        char temp;
        while (end>begin){
            temp = array[begin];
            array[begin]=array[end];
            array[end] = temp;
            end--;
            begin++;
        }
        return new String(array);
    }

}
