package org.example;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base) {
        this.base = base;
        this.height = (base * Math.sqrt(3)) / 2;
    }

    public Triangle() {
        this(6);
    }

    @Override
    double getArea() {
        return (base * height) / 2;
    }

    @Override
    double getPerimeter() {
        return base * 3;
    }

}
