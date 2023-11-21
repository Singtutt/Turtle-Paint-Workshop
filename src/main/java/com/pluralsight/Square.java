package com.pluralsight;

import java.awt.*;

public class Square extends Shape {
    private int sideLength;

    public Square(Point location, Color color, int border, int sideLength) {
        super(location, color, border);
        this.sideLength = sideLength;
    }


    @Override
    public void paint() {}
}
