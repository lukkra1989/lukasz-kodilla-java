package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatPaint;
    private boolean isExecuted=false;


    public PaintingTask(String taskName, String color, String whatPaint,boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatPaint = whatPaint;
        this.isExecuted=isExecuted;
    }

    @Override
    public void executeTask() {
        isExecuted=true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
