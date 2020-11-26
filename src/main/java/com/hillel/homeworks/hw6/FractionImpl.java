package com.hillel.homeworks.hw6;

public class FractionImpl implements Fraction{

    private final int numirator;
    private final int denominator;

    public FractionImpl(int numirator, int denominator) {
        if(denominator==0){
            throw new IllegalArgumentException("can't be 0;");
        }
        this.numirator = numirator;
        this.denominator = denominator;
    }
    public FractionImpl(Fraction other) {
        this.numirator = other.getNumirator();
        this.denominator = getDenominator();
    }
    @Override
    public int getNumirator() {
        return numirator;
    }
    @Override
    public int getDenominator() {
        return denominator;
    }


    @Override
    public Fraction plus(Fraction other) {
        return null;
    }

    @Override
    public Fraction minus(Fraction other) {
        return null;
    }

    @Override
    public Fraction multiply(Fraction other) {
        return null;
    }

    @Override
    public Fraction divide(Fraction other) {
        return null;
    }

    @Override
    public String toString() {
        return  numirator + "/" + denominator;
    }
}
