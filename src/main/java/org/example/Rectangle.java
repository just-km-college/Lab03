package org.example;

public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(Color color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        this(new Color(255,255,255),1,1);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
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
