package com.hillel.homeworks.hw19;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {
    private int[] arr1;
    private int[] arr2;
    private int[] arr3;
    private int[] arr4;

    private int result;

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public int[] getArr2() {
        return arr2;
    }

    public void setArr2(int[] arr2) {
        this.arr2 = arr2;
    }

    public int[] getArr3() {
        return arr3;
    }

    public void setArr3(int[] arr3) {
        this.arr3 = arr3;
    }

    public int[] getArr4() {
        return arr4;
    }

    public void setArr4(int[] arr4) {
        this.arr4 = arr4;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }



    public synchronized void arrCount(int[] arr) throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            result += arr[i];
            System.out.println(arr[i] + " " + Thread.currentThread().getName());
        }
    }

    public int allResult() {
        result = result / (arr1.length + arr2.length + arr3.length + arr4.length);
        return result;
    }

}
