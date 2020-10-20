package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String myPoem, PoemDecorator poemDecorator){
        String change= poemDecorator.decorate(myPoem);
        System.out.println("Poem after change: " + change);
    }
}
