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
            myLibrary.getBooks().add(new Book("title1" , "Writer X" , LocalDate.of(1990, 1, 2)));
        }

        System.out.println(myLibrary);

        Book booksByY = new Book("Title2 ", "Writer Y", LocalDate.of(1980, 2, 3));
        System.out.println(myLibrary.getBooks().size());
        myLibrary.getBooks().remove(booksByY);
        System.out.println(myLibrary.getBooks().size());

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = myLibrary.shallowCopy();
            clonedLibrary.setName("Novels");
            //myLibrary.getBooks().add(new Book())
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(myLibrary);
        System.out.println(clonedLibrary);

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = myLibrary.deepCopy();
            deepClonedLibrary.setName("Horrors");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        myLibrary.getBooks().remove("Fantasy");

        //Then
        System.out.println(myLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(5, myLibrary.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), myLibrary.getBooks());
        assertEquals(deepClonedLibrary.getBooks(), myLibrary.getBooks());

    }

}
