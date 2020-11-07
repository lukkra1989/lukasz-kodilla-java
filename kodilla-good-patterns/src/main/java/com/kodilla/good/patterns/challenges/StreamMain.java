package com.kodilla.good.patterns.challenges;
import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        MovieStore movieStore=new MovieStore();
        String titles = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(titles);
    }
}
