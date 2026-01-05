package Abstraction;

// abstract class - class which is declared as abstract
public abstract class Shap {
    private String color;

    public Shap() {
    }

    public Shap(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    } // concrete method

    public abstract float calculatorArea();
    // abstract method - method does not have method body
}

class Circle extends Shap {
    private final float PIE = 3.14f;
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculatorArea() {
        return PIE * radius * radius;
    }
}

class ShapRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of the circle: " + circle.calculatorArea());
    }
}
