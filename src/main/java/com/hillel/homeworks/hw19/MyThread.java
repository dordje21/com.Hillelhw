package com.hillel.homeworks.hw19;

import java.lang.reflect.Array;

public class MyThread implements Runnable {
    Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            counter.arrCount(counter.getArr1());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
