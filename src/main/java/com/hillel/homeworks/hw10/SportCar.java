package com.hillel.homeworks.hw10;

import java.util.Date;

public class SportCar extends Auto {
    protected int maxSpeed;
    protected int engineСapacity;
    protected int power;

    public SportCar(int year, String country, String mark, int price, String complectation, Date sellingDate, String buyerName, int maxSpeed, int engineСapacity, int power) {
        super(year, country, mark, price, complectation, sellingDate, buyerName);
        this.maxSpeed = maxSpeed;
        this.engineСapacity = engineСapacity;
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(int engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                ", engineСapacity=" + engineСapacity +
                ", power=" + power +
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
