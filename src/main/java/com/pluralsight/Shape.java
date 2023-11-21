package com.pluralsight;

import java.awt.*;

public abstract class Shape {
    protected Point location;
    protected Color color;
    protected int border;

    public Shape(Point location, Color color, int border) {
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }


    public abstract void paint();

}
