package com.hillel.homeworks.hw11;

import java.util.logging.Level;

public class ConsoleLogger extends Logger {
    public void log(String messege, Level level){
        System.out.println(getTimeStamp() + " " + level + ": " + messege);
    }
}
