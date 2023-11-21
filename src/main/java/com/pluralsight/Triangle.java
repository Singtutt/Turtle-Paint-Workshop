package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape {
    private int baseLength;
    private int heightLength;
    public Triangle(Point location, Color color, int border, int baseLength, int heightLength) {
        super(location, color, border);
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }

    @Override
    public void paint() {}
}
