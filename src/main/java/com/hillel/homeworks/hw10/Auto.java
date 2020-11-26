package com.hillel.homeworks.hw10;

import java.util.Date;

public class Auto extends Transport {
    protected String mark;
    protected int price;
    protected String complectation;
    protected Date sellingDate;
    protected String buyerName;

    public Auto(int year, String country, String mark, int price, String complectation, Date sellingDate, String buyerName) {
        super(year, country);
        this.mark = mark;
        this.price = price;
        this.complectation = complectation;
        this.sellingDate = sellingDate;
        this.buyerName = buyerName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getComplectation() {
        return complectation;
    }

    public void setComplectation(String complectation) {
        this.complectation = complectation;
    }

    public Date getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", price=" + price +
                ", complectation='" + complectation + '\'' +
                ", sellingDate=" + sellingDate +
                ", buyerName='" + buyerName + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
