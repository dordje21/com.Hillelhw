package com.hillel.homeworks.hw10;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        Date date = cal.getTime();

        System.out.println("Creating autos:");

        Auto specialCar = new SpecialCar(2005, "POLAND", "HENDAY", 2000, "FULL", date, "Martin", "Baggi", 10);
        Auto usedСar = new UsedСar(1998, "USA", "AUDI", 5000, "FULL", date, "Maks", 1900, "Mark");
        Auto sportCar = new SportCar(1995, "UKRAINE", "LADA", 1000, "full", date, "Andrey", 60, 19990, 10);
        System.out.println(usedСar.toString());
        System.out.println(specialCar.toString());
        System.out.println(sportCar.toString());

        System.out.println("");
        System.out.println("Creating soldCars, adding autos to soldCars: ");

        SoldCars soldCars = new SoldCars();

        soldCars.addAuto(specialCar);
        soldCars.addAuto(usedСar);
        soldCars.addAuto(sportCar);

        System.out.println("");
        System.out.println("Printing sold autos: ");
        soldCars.printListAddedAuto();

    }

}
