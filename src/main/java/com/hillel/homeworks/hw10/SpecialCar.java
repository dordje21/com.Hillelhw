package com.hillel.homeworks.hw10;

import java.util.Date;


public class SpecialCar extends Auto {
    protected String kind;
    protected int mass;

    public SpecialCar(int year, String country, String mark, int price, String complectation, Date sellingDate, String buyerName, String kind, int mass) {
        super(year, country, mark, price, complectation, sellingDate, buyerName);
        this.kind = kind;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
                "kind='" + kind + '\'' +
                ", mass=" + mass +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", complectation='" + complectation + '\'' +
                ", sellingDate=" + sellingDate +
                ", buyerName='" + buyerName + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
