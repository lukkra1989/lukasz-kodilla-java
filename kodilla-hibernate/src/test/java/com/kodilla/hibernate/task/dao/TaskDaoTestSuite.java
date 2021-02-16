//package com.kodilla.hibernate.task.dao;
//
//import com.kodilla.hibernate.task.Task;
//import com.kodilla.hibernate.task.TaskFinancialDetails;
//import com.kodilla.hibernate.task.TaskList;
//import com.kodilla.hibernate.task.dao.TaskListDao;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.jdbc.core.JdbcAggregateOperations;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TaskDaoTestSuite {
//
//    @Autowired
//    private TaskDao taskDao;
//    @Autowired
//    private TaskListDao taskListDao;
//    private static final String DESCRIPTION = "Test: Learn Hibernate";
//
//    private static final String TODO = "ToDo";
//
//    @Test
//    public void testTaskDaoSave() {
//        //Given
//        Task task = new Task(DESCRIPTION, 7);
//
//        //When
//        taskDao.save(task);
//
//        //Then
//        int id = task.getId();
//        Optional<Task> readTask = taskDao.findById(id);
//        Assert.assertEquals(id, readTask.isPresent());
//        //Optional<Task> readTask = taskDao.findById(id);
//        assertTrue(readTask.isPresent());
//
//        //CleanUp
//        taskDao.deleteById(id);
//    }
//
//    @Test
//    public void testTaskDaoFindByDuration() {
//        //Given
//        Task task = new Task(DESCRIPTION, 7);
//        taskDao.save(task);
//        int duration = task.getDuration();
//
//        //When
//        List<Task> readTasks = taskDao.findByDuration(duration);
//
//        //Then
//        Assert.assertEquals(1, readTasks.size());
//
//        //CleanUp
//        int id = readTasks.get(0).getId();
//        taskDao.deleteById(id);
//    }
//
//    @Test
//    public void testTaskDaoSaveWithFinancialDetails() {
//        //Given
//        Task task = new Task(DESCRIPTION, 30);
//        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
//
//        //When
//        taskDao.save(task);
//        int id = task.getId();
//
//        //Then
//        Assert.assertNotEquals(0, id);
//
//        //CleanUp
//        taskDao.deleteById(id);
//    }
//
//    @Test
//    public void testNamedQueries() {
//        //Given
//        Task task1 = new Task("Test: Study Hibernate", 3);
//        Task task2 = new Task("Test: Practice Named Queries", 6);
//        Task task3 = new Task("Test: Study native queries", 7);
//        Task task4 = new Task("Test: Makse some tests", 13);
//
//        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
//        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
//        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
//        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);
//
//        task1.setTaskFinancialDetails(tfd1);
//        task2.setTaskFinancialDetails(tfd2);
//        task3.setTaskFinancialDetails(tfd3);
//        task4.setTaskFinancialDetails(tfd4);
//
//        TaskList taskList = new TaskList(TODO, "ToDo tasks");
//        taskList.getTasks().add(task1);
//        taskList.getTasks().add(task2);
//        taskList.getTasks().add(task3);
//        taskList.getTasks().add(task4);
//
//        task1.setTaskList(taskList);
//        task2.setTaskList(taskList);
//        task3.setTaskList(taskList);
//        task4.setTaskList(taskList);
//
//        taskListDao.save(taskList);
//        int id = taskList.getId();
//
//        //When
//        List<Task> longTasks = taskDao.retrieveLongTasks();
//        List<Task> shortTasks = taskDao.retrieveShortTasks();
//        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
//        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWitDurationLongerThan(6);
//
//        //Then
//        try {
//            assertEquals(29, longTasks.size());
//            assertEquals(106, shortTasks.size());
//            assertEquals(48, enoughTimeTasks.size());
//            assertEquals(80, durationLongerThanTasks.size());
//        } finally {
//            //CleanUp
//            taskListDao.deleteById(id);
//        }
//    }
//}
//
//
//
