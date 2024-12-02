package org.example;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(Color color, double base) {
        super(color);
        this.base = base;
        this.height = (base * Math.sqrt(3)) / 2;
    }

    public Triangle() {
        this(new Color(255,255,255),6);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
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
