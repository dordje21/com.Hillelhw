package com.hillel.homeworks.hw10;

import java.util.Arrays;

public class SoldCars {
    Auto auto;
    static Object[] o = new Object[1000];

    public SoldCars() {
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public static Object[] getO() {
        return o;
    }

    public static void setO(Object[] o) {
        SoldCars.o = o;
    }

    public void addAuto(Auto auto) {
        for (int i = 0; i < o.length; i++) {
            if (o[i] == null) {
                o[i] = auto;
                System.out.println(auto.getMark() + " added to sold cars ");
                break;
            }
        }
    }

    public void printListAddedAuto() {
        for (int i = 0; i < o.length; i++) {
            if (o[i] != null) {
                System.out.println(o[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "SoldCars{" +
                "o=" + Arrays.toString(o) +
                '}';
    }
}
