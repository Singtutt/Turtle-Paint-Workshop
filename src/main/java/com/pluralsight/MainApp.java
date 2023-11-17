package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(600, 600);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 200;
        int height = 200;

        square(turtle);
        circle(turtle);
        pizza(turtle);
    }
    private static void square(Turtle turtle) {
        turtle.penDown();
        turtle.setColor(Color.BLACK);

        for (int i = 0; i < 4; i++) {
            turtle.forward(100);
            turtle.turnRight(90);
        }
    }
    private static void circle(Turtle turtle) {
        turtle.setDelay(0.0001);
        turtle.penUp();
        turtle.goTo(100,0);
        turtle.penDown();
        turtle.setColor(Color.BLUE);

        for (int i = 0; i < 360; i++) {
            turtle.forward(1);
            turtle.turnRight(1);
        }
    }
     private static void pizza(Turtle turtle) {
        turtle.setDelay(0.0001);
        turtle.penUp();
        turtle.goTo(-100, -100);
        turtle.penDown();
        turtle.setColor(Color.cyan);
        for (int i = 0; i < 270; i++) {
            turtle.forward(1);
            turtle.turnRight(1);
        }
        turtle.turnRight(90);
        for (int i = 0; i < 90; i++) {
            turtle.forward(1);
            turtle.turnRight(1);
        }
     }
}
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);