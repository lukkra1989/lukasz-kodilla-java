package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BoardTestSuite {
    @Test
    void testBeanExists() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        //Then
        assertNotNull(board);
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("Example text");
        board.getInProgressList().tasks.add("Progress text");
        board.getDoneList().tasks.add("Done text");

        //Then
        assertThat(board.getToDoList().tasks).contains("Example text");
        assertThat(board.getInProgressList().tasks).contains("Progress text");
        assertThat(board.getDoneList().tasks).contains("Done text");
    }
}
