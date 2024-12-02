package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShapeDescriberTest {
    @Test
    public void testDescribe() {

        Color color = new Color(255,0,0);

        Rectangle rectangle1 = new Rectangle(color,20,4);
        Rectangle rectangle2 = new Rectangle();
        Triangle triangle = new Triangle(color,6);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ShapeDescriber.describe(rectangle1);
        ShapeDescriber.describe(rectangle2);
        ShapeDescriber.describe(triangle);

        String expectedOut =
                """
                        Class is Rectangle
                        Area 80,00
                        Perimeter 48,00
                        Color Color[alfa=0, red=255, green=0, blue=0]
                        
                        Class is Rectangle
                        Area 1,00
                        Perimeter 4,00
                        Color Color[alfa=0, red=255, green=255, blue=255]
                        
                        Class is Triangle
                        Area 15,59
                        Perimeter 18,00
                        Color Color[alfa=0, red=255, green=0, blue=0]

                        """;

        assertEquals(expectedOut,outputStream.toString());

        System.setOut(originalOut);
    }
}