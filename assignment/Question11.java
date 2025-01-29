package assignment;

abstract class Shape {
    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape implements Drawable {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Question11 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);

        circle.displayShape();
        circle.draw();
        System.out.printf("Area of Circle: %.1f\n", circle.calculateArea());

        System.out.println();

        rectangle.displayShape();
        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
