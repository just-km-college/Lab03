package org.example;

public abstract class Shape {

    abstract double getArea();
    abstract double getPerimeter();

    private void print() {
        System.out.printf("%s is %s\n",this.getClass().getSimpleName(), this.toString());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
