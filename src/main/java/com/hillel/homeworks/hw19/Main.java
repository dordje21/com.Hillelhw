package com.hillel.homeworks.hw19;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //1.Сгенерировать массиив на 1_000_000 рандомных интов.
        // Вычислить среднее арифметическое, при этом замерить время выполнения.
        //Сделать тоже самое используя 4 потока (4 массива по 250_000 элементов).
        //Не забываем про складывать результат работы потоков в main.


        //однопоточныый вариант
        int[] arr = new int[1_000_000];
        int all = 0;
        int result;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            all += arr[i];
        }
        result = all / arr.length;
        long m1 = System.currentTimeMillis();


        //многопоточный вариант

        int[] arr1 = new int[250_000];
        int[] arr2 = new int[250_000];
        int[] arr3 = new int[250_000];
        int[] arr4 = new int[250_000];

        Counter counter = new Counter();
        counter.setArr1(arr1);
        counter.setArr2(arr2);
        counter.setArr3(arr3);
        counter.setArr4(arr4);

        Runnable myThread = new MyThread(counter);
        Runnable myThread2 = new MyThread2(counter);
        Runnable myThread3 = new MyThread3(counter);
        Runnable myThread4 = new MyThread4(counter);
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread2);
        Thread thread3 = new Thread(myThread3);
        Thread thread4 = new Thread(myThread4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        counter.allResult();

        long m2 = System.currentTimeMillis() - m1;
        System.out.println("среднее в одном потоке = " + result);
        System.out.println("время в одном потоке = " + m1 + " милисекунды ");

        System.out.println("--------------------------------------------------");

        System.out.println("среднее в 4 потока = " + counter.getResult());
        System.out.println("время в 4 потока = " + m2 + " милисекунды ");

    }
}
