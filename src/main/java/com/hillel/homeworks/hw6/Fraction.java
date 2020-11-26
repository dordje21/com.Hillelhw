package com.hillel.homeworks.hw6;

public interface Fraction {
    //Написать класс FractionNumber, который бы представлял тип даных "Простая Дробь"
    //В классе должно быть две поля
    //В классе должны быть методы (plus, minus, multiply, divide)
    //Также, в классе должен быть метод toString, который печатает дробь в виде "2/3
    //Сделать этот тип данных неизменяемым (immutable)

    int getNumirator();

    int getDenominator();

    Fraction plus(Fraction other);

    Fraction minus(Fraction other);

    Fraction multiply(Fraction other);

    Fraction divide(Fraction other);
}
