package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(1, "name");
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList> findTask = taskListDao.findByListName(name);

        //Then
        assertEquals(findTask.size(), 1);

        //CleanUp
        taskListDao.deleteById(taskList.getId());
    }
}
