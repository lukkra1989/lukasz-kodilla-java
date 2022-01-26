package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Forum {

    public static List<ForumUser> getUserList() {
        ForumUser user5 = new ForumUser(5, "Walter", 'M', LocalDate.of(1970, 2, 1), 2);
        final List<ForumUser> theUserList = new LinkedList<>();
        theUserList.add(new ForumUser(1, "John", 'M', LocalDate.of(1990, 3, 2), 1));
        theUserList.add(new ForumUser(2, "Emma", 'F', LocalDate.of(1970, 5, 12), 155));
        theUserList.add(new ForumUser(3, "Tony", 'M', LocalDate.of(1980, 12, 9), 16));
        theUserList.add(new ForumUser(4, "Larysa", 'F', LocalDate.of(2001, 3, 7), 201));
        theUserList.add(user5);
        return theUserList;
    }
}
