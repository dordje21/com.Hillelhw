package com.hillel.homeworks.hw4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecture4Task3 {
    public static void main(String[] args) {

        String str1 = "name_is_valid_1";
        System.out.println(str1 + " = "  + isValidUsername(str1));

        String str2 = "Name_is_invalid_1";
        System.out.println(str2 + " = "  + isValidUsername(str2));
    }
    public static boolean isValidUsername(String name) {
        String regex = "^[a-z0-9+_.-]\\w{5,15}$";

        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);
        return m.matches();
    }
}
