package com.pluralsight;
import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public abstract class Shape {
    protected double x;
    protected double y;
    protected Color color;
    protected double borderWidth;


    public Shape(double x, double y, Color color, double borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public abstract void paint(World world);
}
