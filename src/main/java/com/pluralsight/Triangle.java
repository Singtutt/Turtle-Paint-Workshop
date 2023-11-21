package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class Triangle extends Shape {
    private int baseLength;
    private int heightLength;

    public Triangle(double x, double y, Color color, double borderWidth, int baseLength, int heightLength) {
        super(x, y, color, borderWidth);
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }

    @Override
    public void paint(World world) {
        Turtle turtle = new Turtle(this.x, this.y, world);
        turtle.setPenWidth(this.borderWidth);
        turtle.setColor(this.color);
        turtle.penUp();
        turtle.goTo(this.x - (double) baseLength / 2, this.y - (double) heightLength / 2);
        turtle.penDown();
        turtle.setDelay(1);

        for (int i = 0; i < 3; i++) {
            turtle.forward(i % 2 == 0 ? baseLength : heightLength);
            turtle.turnRight(120);
        }
    }
}
