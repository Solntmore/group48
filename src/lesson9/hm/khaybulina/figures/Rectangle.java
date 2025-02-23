package lesson9.hm.khaybulina.figures;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(length, rectangle.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return "Прямоугольник: " + "Ширина = " + width + " см." + ", Длина = " + length + " см.";
    }
}
