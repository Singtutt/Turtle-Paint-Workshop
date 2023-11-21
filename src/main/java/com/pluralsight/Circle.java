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
        int sides = 360;
        double angle = 360.0 / sides;
        double distance = 2 * Math.PI * radius / sides;
        turtle.penUp();
        turtle.goTo(this.x - radius, this.y);
        turtle.penDown();

        for (int i = 0; i < sides; i++) {
            turtle.forward(distance);
            turtle.turnRight(angle);
        }
    }
}
