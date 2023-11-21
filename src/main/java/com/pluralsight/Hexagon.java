package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;
import java.awt.*;

public class Hexagon extends Shape {
    private double sidesLength;

    public Hexagon(double x, double y, Color color, double borderWidth, double sidesLength) {
        super(x, y, color, borderWidth);
        this.sidesLength = sidesLength;
    }

    @Override
    public void paint(World world) {
        Turtle turtle = new Turtle(this.x, this.y, world);
        turtle.setPenWidth(this.borderWidth);
        turtle.setColor(this.color);
        turtle.penUp();
        turtle.goTo(this.x, this.y - (double) sidesLength / 2);
        turtle.penDown();
        turtle.setDelay(1);

        for(int i = 0; i < 6; i++) {
            turtle.forward(sidesLength);
            turtle.turnRight(60);
        }
    }
}
