package com.hillel.homeworks.hw8;

import java.util.Date;

public class Book {
    private static Author author;
    private static Date issueDate;
    private static Genre genre;
    private static Long isbn;


    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.issueDate = new Date(issueDate.getTime());
        this.genre = genre;
        this.isbn = isbn;
    }

    public static Author getAuthor() {
        return author;
    }

    public static Date getIssueDate() {

        return new Date(issueDate.getTime());
    }

    public static Genre getGenre() {
        return genre;
    }

    public static Long getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

    @Override
    public String toString() {
        return "Book = " + author + "; issueDate = " + issueDate + "; genre = " + genre + "; isbn = " + isbn + ";";
    }
}
