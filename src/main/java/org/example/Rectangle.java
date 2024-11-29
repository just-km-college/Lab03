package org.example;

public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        this(1,1);
    }

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return a * 2 + b * 2;
    }

}
