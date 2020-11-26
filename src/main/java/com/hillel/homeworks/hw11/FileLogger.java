package com.hillel.homeworks.hw11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class FileLogger extends Logger{

//    public void log(String messege){
//        try(FileWriter fileWriter = new FileWriter("FileLogger.txt")){
//            fileWriter.write(messege);
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }

    @Override
    public void log(String messege) {
        try(FileWriter fileWriter = new FileWriter("FileLogger.txt")){
            fileWriter.write(messege);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
