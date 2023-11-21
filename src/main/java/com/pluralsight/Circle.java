package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, Color color, double borderWidth, double radius) {
        super(x, y, color, borderWidth);
        this.radius = radius;
    }

    @Override
    public void paint(World world) {
        Turtle turtle = new Turtle(this.x, this.y, world);
        turtle.setPenWidth(this.borderWidth);
        turtle.setColor(this.color);
        turtle.penUp();
        turtle.goTo(this.x + this.radius, this.y);
        turtle.penDown();
        turtle.setDelay(0);
        int sides = 360;
        int angle = 360 / sides;

        for (int i = 0; i < sides; i++) {
            turtle.forward(this.radius * 2 * Math.PI / sides);
            turtle.turnRight(angle);
        }
    }
}
