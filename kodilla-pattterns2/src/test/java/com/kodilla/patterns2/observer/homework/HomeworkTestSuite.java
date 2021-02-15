package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testMentor(){
        //Given
        StudentTasksQueue queue1=new StudentTasksQueue("Stream");
        StudentTasksQueue queue2=new StudentTasksQueue("REST API");
        StudentTasksQueue queue3=new StudentTasksQueue("Patterns");
        StudentTasksQueue queue4=new StudentTasksQueue("JDBC");
        StudentTasksQueue queue5=new StudentTasksQueue("SPRING SECURITY");

        Mentor olgierd=new Mentor("Olgierd");
        Mentor gerald= new Mentor("Gerald");

        //When
        queue1.addHomework(olgierd);
        queue2.addHomework(gerald);
        queue3.addHomework(olgierd);
        queue4.addHomework(gerald);
        queue5.addHomework(gerald);

        //Then
        assertEquals(2,olgierd.getUpdateCount());
        assertEquals(3,gerald.getUpdateCount());

    }

}
