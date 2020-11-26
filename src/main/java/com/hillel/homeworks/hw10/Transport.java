package com.hillel.homeworks.hw10;

abstract class Transport {
    protected int year;
    protected String country;

    public Transport(int year, String country) {
        this.year = year;
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
