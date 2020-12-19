package com.hillel.homeworks.hw22;

public class MyThread4 implements Runnable {
    Counter counter;

    public MyThread4(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            counter.arrCount(counter.getArr4());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}