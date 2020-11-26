package com.hillel.homeworks.hw4;

public class Task2 {
    public static void main(String arg[]){
        String word = "polindrommordnilop";
        boolean result = isPalindrom(word);
        if (result == true){
            System.out.println("word is polindrom");
        } else {
            System.out.println("word is not polindrom");
        }

    }
    public static boolean isPalindrom(String s){
        int n = s.length();
        for(int i = 0; i < (n/2); i++){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
