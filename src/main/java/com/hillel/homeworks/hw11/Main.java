package com.hillel.homeworks.hw11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        consoleLogger.log("first log console", Level.FINE);

        fileLogger.log("first log file", Level.WARNING);

        Thread.sleep(3000);

        consoleLogger.log("Second log console ", Level.INFO);

        fileLogger.log("Second log file!", Level.FINE);
    }


}
