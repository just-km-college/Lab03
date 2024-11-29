package org.example;

public class Main {
    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle(5,4);
        Shape rectangle2 = new Rectangle();

        Shape triangle1 = new Triangle(10);
        Shape triangle2 = new Triangle();

        ShapeDescriber.describe(rectangle1);
        ShapeDescriber.describe(rectangle2);
        ShapeDescriber.describe(triangle1);
        ShapeDescriber.describe(triangle2);

    }

}