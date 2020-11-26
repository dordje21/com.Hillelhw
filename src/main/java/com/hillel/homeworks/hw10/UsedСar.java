package com.hillel.homeworks.hw10;

import java.util.Date;

public class UsedСar extends Auto {
    protected int mileage;
    protected String ownerName;

    public UsedСar(int year, String country, String mark, int price, String complectation, Date sellingDate, String buyerName, int mileage, String ownerName) {
        super(year, country, mark, price, complectation, sellingDate, buyerName);
        this.mileage = mileage;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "UsedСar{" +
                "mileage=" + mileage +
                ", ownerName='" + ownerName + '\'' +
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
