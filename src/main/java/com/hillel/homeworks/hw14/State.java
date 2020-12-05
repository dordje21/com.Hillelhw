package com.hillel.homeworks.hw14;

import java.util.Arrays;

public class State<T extends Number> {
    private T[] data;

    public State(T[] data) {
        this.data = data;
    }

    public void printData(){
        System.out.println(Arrays.toString(data));
    }

    public double average(){
        double average = 0;
        for (T dataItem : data){
            average = dataItem.doubleValue();
        }
        return  average/data.length ;
    }

    public boolean isSameAverage(State<?> state){
        return average() == state.average();
    }
}
