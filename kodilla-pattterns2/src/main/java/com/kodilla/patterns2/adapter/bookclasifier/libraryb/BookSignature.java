package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class BookSignature {
    private final String signature;
    private final BookB bookB;

    public BookSignature(final String signature , final BookB bookB) {
        this.signature = signature;
        this.bookB = bookB;
    }

    public String getSignature() {
        return signature;
    }
}
