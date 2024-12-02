package org.example;

public class Main {
    public static void main(String[] args) {

        Color color = new Color(100,200,200,200);

        Shape rectangle1 = new Rectangle(color,5,4);
        Shape rectangle2 = new Rectangle();

        Shape triangle1 = new Triangle(color,10);
        Shape triangle2 = new Triangle();

        ShapeDescriber.describe(rectangle1);
        ShapeDescriber.describe(rectangle2);
        ShapeDescriber.describe(triangle1);
        ShapeDescriber.describe(triangle2);

        System.out.printf("triangle1 color description: %s", triangle1.getColorDescription());

    }

}