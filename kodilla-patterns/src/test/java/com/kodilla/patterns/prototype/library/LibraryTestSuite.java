package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() throws CloneNotSupportedException {

        //Given
        Library myLibrary = new Library("Fantasy");
        for (int i = 0; i < 5; i++) {
            myLibrary.getBooks().add(new Book("title1", "Writer X", LocalDate.of(1990, 1, 2)));
        }

        Book booksByY = new Book("Title2 ", "Writer Y", LocalDate.of(1980, 2, 3));
        myLibrary.getBooks().remove(booksByY);

        //making a shallow copy
        Library clonedLibrary = null;
        clonedLibrary = myLibrary.shallowCopy();

        //making a deep copy
        Library deepClonedLibrary = null;
        deepClonedLibrary = myLibrary.deepCopy();

        //When&Then
        assertEquals(clonedLibrary, myLibrary);
        assertEquals(deepClonedLibrary, myLibrary);
    }
}
