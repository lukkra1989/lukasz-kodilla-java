package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatPaint;

    public PaintingTask(String taskName, String color, String whatPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatPaint = whatPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("We Painted " +taskName +"on"+ color +" a new " +whatPaint);
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
