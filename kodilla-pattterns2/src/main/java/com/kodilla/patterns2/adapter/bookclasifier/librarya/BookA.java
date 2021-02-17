package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class BookA {
     String author;
     String title;
      int publicationYear;
     String signature;

    public BookA( String author,  String title,  int publicationYear,  String signature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
