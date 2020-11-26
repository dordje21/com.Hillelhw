package com.hillel.homeworks.hw19;

public class MyThread3 implements Runnable {
    Counter counter;

    public MyThread3(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            counter.arrCount(counter.getArr3());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}