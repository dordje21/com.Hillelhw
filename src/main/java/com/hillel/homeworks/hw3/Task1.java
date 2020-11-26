package com.hillel.homeworks.hw3;

public class Task1 {
    public static void main(String[] args) {
        String s = "sdsdsd";
        Class<? extends String> aClass = s.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);
        Task_00 task_00 = new Task_00();
        System.out.println(task_00.getClass().getClassLoader());

    }
}
