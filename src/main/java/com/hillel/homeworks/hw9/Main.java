package com.hillel.homeworks.hw9;

import java.util.Calendar;
import java.util.Date;

import static com.hillel.homeworks.hw9.Genre.FAIRY_TALE;
import static com.hillel.homeworks.hw9.Genre.PHANTASY;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1994);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 21);
        Date dateOfBirth = cal.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2020);
        cal2.set(Calendar.MONTH, Calendar.JANUARY);
        cal2.set(Calendar.DAY_OF_MONTH, 1);
        Date issueDate = cal2.getTime();

        Book book1 = new Book(new Author("Michael", "Lytvyn", dateOfBirth), issueDate,  FAIRY_TALE, 2147483649L);
        Book book2 = new Book(new Author("Michael2", "Lytvyn", dateOfBirth), issueDate,  PHANTASY, 2147483649L);

        System.out.println(book1.toString());

        System.out.println("Genre: book1   " + book1.getGenre());

        System.out.println("Genre: book2  " + book2.getGenre());

        System.out.println(book1.getAuthor().getFirstName());
    }
}
