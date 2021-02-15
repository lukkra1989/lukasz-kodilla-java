package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasksQueue implements ObserverableHomework{
    private final List<ObserverHomeWork> observersHomeWork;
    private final List<String>homeworks;
     private String title;

    public StudentTasksQueue(String title) {
        observersHomeWork = new ArrayList<>();
        homeworks=new ArrayList<>();
        this.title = title;
    }

    @Override
    public void addHomework(ObserverHomeWork homeWork) {
        observersHomeWork.add(homeWork);
        notifyHomework();
    }

    @Override
    public void notifyHomework() {
        for(ObserverHomeWork obs: observersHomeWork){
            obs.update(this);
        };
    }

    @Override
    public void removeHomework(ObserverHomeWork homeWork) {
        observersHomeWork.remove(homeWork);
    }

    public List<ObserverHomeWork> getObserversHomeWork() {
        return observersHomeWork;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getTitle() {
        return title;
    }
}
