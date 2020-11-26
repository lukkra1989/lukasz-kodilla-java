package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping", shoppingTask.getTaskName());
        assertEquals(false, shoppingTask.isTaskExecuted());
        //assertEquals( ",shoppingTask.executeTask());
    }

    @Test
    void testPaintingTask(){
        //Given
        TaskFactory taskFactory=new TaskFactory();
        //When
        Task paintingTask= taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Painting",paintingTask.getTaskName());
        assertEquals(false,paintingTask.isTaskExecuted());
        //assertEquals(,paintingTask.executeTask());
    }

    @Test
    void testDrivingTask(){
        //Given
        TaskFactory taskFactory=new TaskFactory();
        //When
        Task drivingTask=taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("DriveThru",drivingTask.getTaskName());
        assertEquals(false,drivingTask.isTaskExecuted());
        //assertEquals(0,drivingTask.executeTask());
    }
}
