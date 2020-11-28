package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING TASK";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Items", 2, true);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "fence", true);
            case DRIVING:
                return new DrivingTask("DriveThru", "Venice Beach", "Camaro", true);
            default:
                return null;

        }
    }
}
