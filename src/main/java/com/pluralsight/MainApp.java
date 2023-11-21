package com.pluralsight;
import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;
import java.awt.*;
import java.util.Scanner;

public class MainApp {
    private int canvasSize;
    private Scanner scan;
    public MainApp() {
        scan = new Scanner(System.in);
    }

    public void start() {
        canvasSize = inputSize();

        boolean exit = false;
        while(!exit) {
            mainMenu();
            int choice = userInput();
            switch (choice) {
                case 1:
                    addShape();
                    break;
                case 2:
                    saveImage();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option... Please choose a valid option.");
                    break;
            }
        }
    }
    private int inputSize() {
        int sizeInput;
        do {
            System.out.println("""
                    Canvas Size?
                    1. Small (200x200)
                    2. Medium (400x400)
                    3. Large (800x800)""");
            sizeInput = scan.nextInt();
            switch (sizeInput) {
                case 1:
                    return 200;
                case 2:
                    return 400;
                case 3:
                    return 800;
                default:
                    System.out.println("Invalid option... Please choose a valid option");
                    break;
            }
        } while (true);
    }

    private void mainMenu() {
        System.out.println("""
                Main Menu:
                1. Add Shape
                2. Save Image
                3. Exit Application""");
    }
    private int userInput() {
        System.out.println("Enter an option: ");
        return scan.nextInt();
    }
    private void addShape() {
        System.out.println("""
                Add Shape:
                1. Square
                2. Circle
                3. Triangle
                4. Hexagon""");
    }
    private void saveImage() {

    }
    public static void main(String[] args) {
        MainApp application = new MainApp();
        application.start();
    }
}
// The world is your canvas
//        World world = new World(600, 600);
//        Turtle turtle = new Turtle(world,-100, -100);
