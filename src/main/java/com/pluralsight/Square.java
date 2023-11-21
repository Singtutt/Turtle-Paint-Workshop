package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class Square extends Shape {
    private double sideLength;

    public Square(double x, double y, Color color, double borderWidth, double sideLength) {
        super(x, y, color, borderWidth);
        this.sideLength = sideLength;
    }

    @Override
    public void paint(World world) {
        Turtle turtle = new Turtle(this.x, this.y, world);
        turtle.setPenWidth(this.borderWidth);
        turtle.setColor(this.color);
        turtle.penUp();
        turtle.goTo(this.x - (double) sideLength / 2, this.y - sideLength / 2);
        turtle.penDown();
        turtle.setDelay(1);

        for (int i = 0; i <4; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
    }
}
