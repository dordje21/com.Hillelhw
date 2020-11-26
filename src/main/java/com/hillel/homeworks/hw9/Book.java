package com.hillel.homeworks.hw9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {
    private final Author author;
    private final Date issueDate;
    private final Genre genre;
    private final Long isbn;
}
