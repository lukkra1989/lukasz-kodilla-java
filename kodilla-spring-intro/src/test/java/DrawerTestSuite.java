import com.kodilla.spring.intro.shape.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        assertEquals("circle", result);
    }

    @Test
    void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        assertEquals("This is a Triangle", result);
    }


//    @Test
//    void testDoDrawing(){
//        //Given
//        //Figure figure=new Figure();
//        //Shape shape = figure;
//        Drawer drawer=new Drawer(Circle circle);
//        //When
//        drawer.doDrawing();
//        //Then
//        //do nothing
//    }
}
