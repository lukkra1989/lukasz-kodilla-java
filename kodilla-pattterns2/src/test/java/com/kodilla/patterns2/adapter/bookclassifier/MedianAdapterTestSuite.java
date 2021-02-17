package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {


    @Test
    public void publicationYearMedianTest(){

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        BookA bookA1=new BookA("Author1","Title 1", 1980,"123456");
        BookA bookA2=new BookA("Author2","Title 2", 1932,"CFH*90");
        BookA bookA3=new BookA("Author3","Title 3", 2017,"1JKL*&89");
        BookA bookA4=new BookA("Author4","Title 4", 2001,"109--PX");

        Set<BookA>bookASet=new HashSet<>();
        bookASet.add(bookA1);
        bookASet.add(bookA2);
        bookASet.add(bookA3);
        bookASet.add(bookA4);

        //When
        int median = medianAdapter.publicationYearMedian(bookASet);

        //Then
        assertEquals(2001,median);
    }






}
