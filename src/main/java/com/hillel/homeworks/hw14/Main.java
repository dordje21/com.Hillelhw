package com.hillel.homeworks.hw14;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{23,221,343,45,265,766,448,339,430};
        Integer[] arr2 = new Integer[]{53,41,343,45,65,66,48,39,40};

        Double[] arr3 = new Double[]{2.3,22.1,34.3,4.5,26.,76.6,44.8,33.9,43.0};
        Double[] arr4 = new Double[]{2.3,22.1,34.3,4.5,26.,76.6,44.8,33.9,43.0};

        State state = new State(arr);
        State state2 = new State(arr2);

        State state3 = new State(arr3);
        State state4 = new State(arr4);

        System.out.println(state.average());
        System.out.println(state2.average());

        state.printData();

        System.out.println(state.isSameAverage(state2));

        System.out.println(state.isSameAverage(state3));

        System.out.println(state3.isSameAverage(state4));
    }
}
