package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    private boolean isExecuted=false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity,boolean isExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isExecuted=isExecuted;
    }
    //ShoppingTask shoppingTask=new ShoppingTask("Shopping", "Candies",22.0,false);

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
