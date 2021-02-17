package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
       /* System.out.println("Task 7.1");
        PoemBeautifier poemBeautifier=new PoemBeautifier();

        System.out.println("Getting Poem more beautiful with lambdas");
        System.out.println();

        poemBeautifier.beautify("Lithuania ,Motherland Ov Mine !",
                (myPoem) ->"ABC" +" " + myPoem + " "+"ABC" );

        poemBeautifier.beautify("Lithuania ,Motherland Ov Mine !",
                (myPoem) -> myPoem.toUpperCase());

        poemBeautifier.beautify("Lithuania ,Motherland Ov Mine !",
                ((myPoem) -> myPoem.toLowerCase()));

        poemBeautifier.beautify("Lithuania ,Motherland Ov Mine !",
                ((myPoem) -> String.valueOf(myPoem.getBytes())));*/

        System.out.println();
        System.out.println("Task 7.3:");
        System.out.println();

        Map<Integer, ForumUser> collect = Forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> ChronoUnit.YEARS.between(user.getDateOfBirth(), LocalDate.now()) > 19)
                .filter(user -> user.getPost() > 0)
                .collect(Collectors.toMap(user -> user.getUserId(), user -> user));
        // .collect(Collectors.toMap(ForumUser::getUserId, Function.identity()));
        System.out.println(collect);

    }
}
