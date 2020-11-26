package com.hillel.homeworks.hw11;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        consoleLogger.log("first log console");

//        fileLogger.log("first log file", Level.FINE);
//        consoleLogger.info("This is message 1");
        Thread.sleep(3000);

        consoleLogger.log("Second log console");

        fileLogger.log("Second log file!");
    }


}
