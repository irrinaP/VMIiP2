package geometry2d;

import exceptions.InvalidRadiusException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidRadiusException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
