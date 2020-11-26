package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){

        //Given
        Library myLibrary = new Library("Fantasy");
//        IntStream.iterate(1,n->n+1)
//                .limit(5)
//                .forEach(n->myLibrary.getBooks().add(new Book("title","author",LocalDate.now())));

        Book myBooks= new Book("Title1","Writer X",LocalDate.now());

        Stream.iterate(1, n->n+1)
                .limit(5)
                .forEach(n->myLibrary.getBooks().add(new Book("Title 2", "Writer Y",LocalDate.now())));

        System.out.println(myBooks);
        System.out.println(myLibrary.toString());


















//        Library myLibrary= new Library("MyOwn");
//        IntStream.iterate(1,n->n+1)
//                .limit(5)
//                .forEach(n->myLibrary.getBooks().add(new Book("MyOwn","Writer", LocalDate.now())));
//
//        Library library=new Library("Fantasy");
//        //library.getBooks().add(myLibrary);
//
//
//        //making a shallow copy of object board
//        Library clonedLibrary = null;
//        try {
//            clonedLibrary = library.shallowCopy();
//            clonedLibrary.setName("Novels");
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e);
//        }
//        System.out.println(library);
//        System.out.println(clonedLibrary);
//        //When
//        //Then
//        assertEquals(5,library.getBooks().size());
//        assertEquals(5,clonedLibrary.getBooks().size());
    }

}
