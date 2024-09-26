package geometry2d;

import exceptions.NegativeValueException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    // Конструктор с проверкой на отрицательные значения
    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new NegativeValueException("Width must be non-negative");
        }
        if (height < 0) {
            throw new NegativeValueException("Height must be non-negative");
        }
        this.width = width;
        this.height = height;
    }

    // Реализация метода area() для вычисления площади
    @Override
    public double area() {
        return width * height;
    }

    // Реализация метода toString() для представления объекта в строковом формате
    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
