package com.pluralsight;

import java.awt.*;

public class Hexagon extends Shape {
    private int sidesLength;

    public Hexagon(Point location, Color color, int border, int sidesLength) {
        super(location, color, border);
        this.sidesLength = sidesLength;
    }


    @Override
    public void paint() {}
}
