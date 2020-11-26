package com.hillel.homeworks.hw11;

public class ConsoleLogger extends Logger {
    public void log(String messege){
        System.out.println(getTimeStamp() + " : " + messege);
    }
}
