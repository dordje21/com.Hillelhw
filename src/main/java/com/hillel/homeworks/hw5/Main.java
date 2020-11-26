package com.hillel.homeworks.hw5;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Создайте POJO Order который будет иметь поля item, deliveryDate(класс Date), size, price
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        Date deliveryDate = cal.getTime();

        Order order = new Order(1, deliveryDate, 11, 121);
        System.out.println(order.toString());
    }
}
