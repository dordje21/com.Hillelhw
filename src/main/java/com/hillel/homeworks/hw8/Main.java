package com.hillel.homeworks.hw8;

import java.util.Calendar;
import java.util.Date;

import static com.hillel.homeworks.hw8.Genre.FAIRY_TALE;

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

        Author author = new Author("Michael", "Lytvyn", dateOfBirth);

        Book book1 = new Book(author, issueDate,  FAIRY_TALE, 2147483649L);
        Book book2 = new Book(author, issueDate,  FAIRY_TALE, 2147483649L);

        System.out.println(book1.toString());

        System.out.println("hashCode book1 = book2 ? : " + (book1.hashCode()==book2.hashCode()));
        System.out.println("book1.equals(book2) ? : " + book1.equals(book2));

        System.out.println("Genre: " + book1.getGenre());
    }

}
