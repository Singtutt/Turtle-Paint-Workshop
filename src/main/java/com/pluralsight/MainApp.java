package com.pluralsight;
import com.pluralsight.forms.World;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    private Scanner scan;
    private World world;

    public MainApp() {
        this.scan = new Scanner(System.in);
        initialCanvas();
        startDrawing();
    }

    private void initialCanvas() {
            System.out.println("""
                    Enter Canvas Size...
                    Canvas Width:\s""");
            int width = inputInteger();
            System.out.println("Canvas Height: ");
            int height = inputInteger();

        this.world = new World(width, height);
    }

    public void startDrawing() {
        boolean process = true;
        while (process) {
            mainMenuDisplay();
            int choice = inputInteger();
            switch (choice) {
                case 1:
                    addShape();
                    break;
                case 2:
                    System.out.println("Enter file name for image (<File Name>.png): ");
                    String fileName = scan.next();
                    saveImage(world, fileName);
                    break;
                case 3:
                    process = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option... Please enter a valid option.");
            }
        }
    }

    private void mainMenuDisplay() {
        System.out.println("""
                Select an option:
                1. Add Shape
                2. Save Image
                3. Exit Application""");
    }

    private void addShape() {
        System.out.println("""
                Shape:
                1. Square
                2. Circle
                3. Triangle
                4. Hexagon""");
        int shapeInput = inputInteger();
        System.out.println("Coordinate (x):");
        double x = inputDouble();
        System.out.println("Coordinate (y):");
        double y = inputDouble();
        System.out.println("Enter border width:");
        double borderWidth = inputDouble();
        Color color = colorInput();

        switch (shapeInput) {
            case 1:
                System.out.println("Enter side length of the Square: ");
                double lengthSide = inputDouble();
                Square square = new Square(x, y, color, borderWidth, lengthSide);
                square.paint(world);
                break;
            case 2:
                System.out.println("Enter radius of the Circle: ");
                double radius = inputDouble();
                Circle circle = new Circle(x, y, color, borderWidth, radius);
                circle.paint(world);
                break;
            case 3:
                System.out.println("Enter base length of the Triangle: ");
                int baseLength = inputInteger();
                System.out.println("Enter height length of the Triangle: ");
                int heightLength = inputInteger();
                Triangle triangle = new Triangle(x, y, color, borderWidth, baseLength, heightLength);
                triangle.paint(world);
                break;
            case 4:
                System.out.println("Enter side length for Hexagon: ");
                double sideLength = inputDouble();
                Hexagon hexagon = new Hexagon(x, y, color, borderWidth, sideLength);
                hexagon.paint(world);
                break;
        }
    }

    private void saveImage(World world, String fileName) {
        String directory = "src/main/resources";
        String filePath = directory + "/" + fileName;
        this.world.saveAs(filePath);
        System.out.println("Image successfully saved as " + filePath);
    }

    private int inputInteger() {
        while (true) {
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input... Please enter a valid integer(s).");
                scan.nextLine();
            }
        }
    }

    private double inputDouble() {
        while (true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input... Please enter a valid number(s).");
                scan.nextLine();
            }
        }
    }

    private Color colorInput() {
        while (true) {
            try {
                System.out.println("""
                        Choose a color:
                        1. Black
                        2. Red
                        3. Orange
                        4. Yellow
                        5. Green
                        6. Blue
                        7. Magenta
                        8. Cyan""");
                int color = inputInteger();

                Color[] options = {Color.BLACK, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN};
                if (color >= 1 && color <=8) {
                    return options[color - 1];
                } else {
                    System.out.println("Invalid Color Choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input... Please enter a valid integer(s).");
                scan.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
    }
}
