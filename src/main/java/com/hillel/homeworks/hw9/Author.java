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
public class Author {
    private final String firstName;
    private final String lastName;
    private final Date  dateOfBirth;

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
        Author author = (Author) obj;
        return author != null ? author.equals(author) : author == null;
    }

}
