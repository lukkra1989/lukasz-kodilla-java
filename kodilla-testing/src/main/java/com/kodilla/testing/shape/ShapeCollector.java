package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

   /* public ShapeCollector(Object circle) {
    }
    public ShapeCollector() {
    }*/

    public boolean addFigure(Shape shape) {
        shapes.add(shape);
        return false;
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        Set<String> names = new HashSet<>();
        for (Shape shape : shapes) {
            names.add(shape.getShapeName());
        }
        StringJoiner sj = new StringJoiner("+");
        for (String str : names) {
            sj.add(str);
        }
        return sj.toString();
    }

    public int getShapeCount() {
        return shapes.size();
    }

}
