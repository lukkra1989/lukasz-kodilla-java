package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BoardConfig {


    @Bean(name="taskList1")
    public TaskList getTaskList(){
        return new TaskList();
    }

    @Bean(name="taskList2")
    public TaskList getTaskList1(){
        return new TaskList();
    }


    @Bean(name="taskList3")
    public TaskList getTaskList2(){
        return new TaskList();
    }

    @Bean//metoda faktoryzująca/ factory method
    public Board newTask(@Qualifier("taskList1") TaskList taskList1, @Qualifier("taskList2")TaskList taskList2,
                         @Qualifier("taskList3")TaskList taskList3){
        return new Board(taskList1, taskList2, taskList3);
    }
}
