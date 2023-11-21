package com.pluralsight;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Point location, Color color, int border, int radius) {
        super(location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {}
}
