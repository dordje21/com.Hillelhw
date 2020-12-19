package com.hillel.homeworks.hw22;

public class MyThread2 implements Runnable {
    Counter counter;

    public MyThread2(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            counter.arrCount(counter.getArr2());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
