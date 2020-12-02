package com.hillel.homeworks.hw11;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;

public class FileLogger extends Logger{
    public File file = new File("FileLogger.txt");


    @Override
    public void log(String messege, Level level) {
        StringBuilder sb = new StringBuilder();
        try(FileReader fileReader = new FileReader("FileLogger.txt")) {
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNext()){
                sb.append(sc.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter fileWriter = new FileWriter("FileLogger.txt")){
            fileWriter.write(sb + "\t" + getTimeStamp() + " " + level + ": " + messege);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
