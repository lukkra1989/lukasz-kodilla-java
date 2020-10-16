package com.kodilla.testing.shape;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class ShapeCollectorTestSuite {
    @DisplayName("When Figure added, " +
            "Then should return True")
    @Test
    void addFigure_returnsTrueWhenAdded(){
        ShapeCollector shapeCollector=new ShapeCollector();

        shapeCollector.addFigure(new Circle(0));

        boolean result = shapeCollector.addFigure(new Circle(0));
        Assertions.assertTrue(result);
    }

    @DisplayName("Checking do method contains proper lenght" +
            "Then should return true if removed correctly")
    @Test
    void removeFigure_removesCorrectly(){

        //Given
        ShapeCollector shapeCollector=new ShapeCollector();
        Circle circle=new Circle(0);
        //When
        shapeCollector.addFigure( circle);
        shapeCollector.removeFigure( circle);
        //Then

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            Shape circleResult=shapeCollector.getFigure(0);
        });
        assertTrue(exception.getMessage().contains("length 0"));
    }

    @DisplayName("Comparing do methods return the same object")
    @Test
    void getFigure_returnsSameObject(){
        //Given
        ShapeCollector shapeCollector=new ShapeCollector();
        Circle circle=new Circle(0);
        //When
        shapeCollector.addFigure( circle);
        Shape circleResult=shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(circle,circleResult);
    }

    @DisplayName("Checking do method returns the same format of figures")
    @Test
    void showFigures_when3FiguresThenReturnsCorrectFormat(){
        //Given
        ShapeCollector shapeCollector=new ShapeCollector();
        String expectedFormat="Circle + Triangle + Square";

        //When
        shapeCollector.addFigure(new Circle(0));
        shapeCollector.addFigure(new Triangle(0,1));
        shapeCollector.addFigure(new Square(0));
        String result=shapeCollector.showFigures();

        //Then
        assertEquals(expectedFormat,result);
    }
}
