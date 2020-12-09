package com.hillel.homeworks.hw15;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        Person person = new Person("Name", "Sername", 21, 190, 90, "postmail@gmail.com");
//        Person.PersonBuilder person1 = new Person.PersonBuilder().setAge(22).setHeight(195).setMail("ww@www.www").setName("Name2").setSerName("Sername").setWeight(95);


        List<Person> personList = new DataProvider().provide("./src/main/java/com/hillel/homeworks/hw15/data.csv");
        System.out.println(personList.toString());

        CovidStatImpl covidStat = new CovidStatImpl(personList);

        System.out.println("MostPopularName - " + covidStat.getMostPopularName());
        System.out.println("MostPopularMailDomain - " + covidStat.getMostMailDomain());
        System.out.println("AverageAge - " + covidStat.getAverageAge());
        System.out.println("AverageHeight - " + covidStat.getAverageHeight());
        System.out.println("AverageWeight - " + covidStat.getAverageWeight());

    }
}
