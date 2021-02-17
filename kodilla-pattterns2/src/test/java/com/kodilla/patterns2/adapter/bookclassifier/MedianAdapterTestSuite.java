//package com.kodilla.patterns2.adapter.bookclassifier;
//
//import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
//import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
//import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
//import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.Assert;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.IntStream;
//
//public class MedianAdapterTestSuite {
//
////    @Before
////    public void  before(){
//      Set<BookA> bookA=new HashSet<>();
////        IntStream.iterate(1,n->n+1).limit(10).forEach(n->bookSetA.add(new BookA("Authhor1"+n, "Title"+n, 1990+2*n,"XYZ"+n/2)));
////    }
//
//
//    @Test
//    public void publicationYearMedianTest(){}
//    //Given
//    MedianAdapter adapter=new MedianAdapter();
//
//    //When
//    int median = adapter.publicationYearMedian(bookA);
//
//    //Then
//    Assert.assertEquals(1900,median);
//}
