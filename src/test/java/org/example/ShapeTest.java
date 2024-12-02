package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTest {

    private Shape testShape;

    @Test
    public void testConstructor() {

        testShape = new ShapeTestHelper(new Color(0,255,0,0));

        assertEquals("Alpha: 0 Red: 255 Green: 0 Blue: 0\n", testShape.getColorDescription());

    }

    @Test
    public void testGetColorDescription() {

        testShape = new ShapeTestHelper(new Color(0,255,0,0));

        assertEquals("Alpha: 0 Red: 255 Green: 0 Blue: 0\n", testShape.getColorDescription());

    }

    @Test
    public void testGetColor() {

        Color color = new Color(255, 0, 0);
        testShape = new ShapeTestHelper(new Color(0,255,0,0));

        assertEquals(color, testShape.getColor());

    }

    @Test
    public void testToString() {

        testShape = new ShapeTestHelper(new Color(0,255,0));

        assertEquals("ShapeTestHelper",testShape.toString());

    }

}

class ShapeTestHelper extends Shape {

    public ShapeTestHelper(Color color) {
        super(color);
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

}