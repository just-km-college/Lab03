package org.example;

public abstract class Shape {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public Color getColor() {
        return this.color;
    }

    public String getColorDescription() {
        return "Alpha: " + this.color.alfa() + " Red: " + this.color.red() + " Green: " + this.color.green() + " Blue: " + this.color.blue() + "\n";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
