package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    @DisplayName("When Figure added, " +
            "Then should return True")
    @Test
    public void addFigure_returnsTrueWhenAdded() {
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(0));

        boolean result = shapeCollector.addFigure(new Circle(0));
        Assertions.assertFalse(result);
    }

    @DisplayName("Checking do method contains proper lenght" +
            "Then should return true if removed correctly")
    @Test
    public void removeFigure_removesCorrectly() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(0);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        //Then
        //
        assertEquals(shapeCollector.getShapeCount(), 0);
    }

    @DisplayName("Comparing do methods return the same object")
    @Test
    public void getFigure_returnsSameObject() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(0);
        Triangle triangle = new Triangle(0, 0);
        Square square = new Square(0);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        Shape circleResult = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(circle, circleResult);
    }

    @DisplayName("Checking do method returns the same format of figures")
    @Test
    public void showFigures_when3FiguresThenReturnsCorrectFormat() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        String expectedFormat = "Circle+Triangle+Square";

        //When
        shapeCollector.addFigure(new Circle(0));
        shapeCollector.addFigure(new Triangle(0, 1));
        shapeCollector.addFigure(new Square(0));
        String result = shapeCollector.showFigures();
        //Then
        assertEquals(expectedFormat, result);
    }
}