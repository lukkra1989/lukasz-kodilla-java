package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> booksMap = bookASet.stream()
                .collect(Collectors.toMap(b -> new BookSignature(b.getSignature()), b -> new BookB(b.getAuthor(), b.getTitle(), b.getPublicationYear())));
        return medianPublicationYear(booksMap);


//        Map<BookSignature, BookB> booksMap=new HashMap<>();
//       for(BookA bookA : bookASet){
//           books.put(new BookSignature(bookB.getSignature(),new BookA(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear(),bookA.getSignature())));
//       }
//        return medianPublicationYear(books) ;
//    }
    }
}
