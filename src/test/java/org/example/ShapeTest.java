package org.example;

public class ShapeTest {



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