package com.hillel.homeworks.hw17;

import java.util.Stack;

public class Validator {
    public static String validateBraces(String string) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i <= string.length() - 1; i ++){

            if(string.substring(i, i+1).equals("("))
                stack.push((string.substring(i, i+1)));

            else if(string.substring(i, i+1).equals("["))
                stack.push((string.substring(i, i+1)));

            else if(string.substring(i, i+1).equals("{"))
                stack.push((string.substring(i, i+1)));

            else if(string.substring(i, i+1).equals(")"))
                if(stack.peek().equals("("))
                    stack.pop();
                else
                    return "NO";

            else if(string.substring(i, i+1).equals("]"))
                if(stack.peek().equals("["))
                    stack.pop();
                else
                    return "NO";

            else if(string.substring(i, i+1).equals("}"))
                if(stack.peek().equals("{"))
                    stack.pop();
                else
                    return "NO";
        }
        return "YES";
    }
}
