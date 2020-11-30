package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {

        //Given
        Library myLibrary = new Library("Fantasy");
        for (int i = 0; i < 5; i++) {
            myLibrary.getBooks().add(new Book("title1", "Writer X", LocalDate.of(1990, 1, 2)));
        }

        Book booksByY = new Book("Title2 ", "Writer Y", LocalDate.of(1980, 2, 3));
        myLibrary.getBooks().remove(booksByY);

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = myLibrary.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = myLibrary.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When&Then
        assertEquals(clonedLibrary, myLibrary);
        assertEquals(deepClonedLibrary, myLibrary);
    }
}
