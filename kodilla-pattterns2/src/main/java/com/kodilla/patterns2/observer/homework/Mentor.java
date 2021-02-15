package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomeWork {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTasksQueue studentTasksQueue) {
        System.out.println("Tutor" + name + "checks tasks : " + studentTasksQueue.getTitle()
                + "with quantity of: " + studentTasksQueue.getHomeworks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
