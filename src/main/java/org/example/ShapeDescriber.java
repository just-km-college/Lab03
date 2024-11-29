package org.example;

public class ShapeDescriber {

    public static void describe(Shape shape) {
        System.out.printf("Class is %s\nArea %.2f\nPerimeter %.2f\n\n", shape, shape.getArea(), shape.getPerimeter());
    }

}
