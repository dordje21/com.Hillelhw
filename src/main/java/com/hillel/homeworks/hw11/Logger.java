package com.hillel.homeworks.hw11;

import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

@Getter
public abstract class Logger {

    public abstract void log(String messege, Level fine);

    public String getTimeStamp(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
