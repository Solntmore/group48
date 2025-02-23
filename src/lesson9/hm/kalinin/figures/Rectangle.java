package lesson9.hm.kalinin.figures;

import java.util.Objects;

class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(sideA, rectangle.sideA) == 0 && Double.compare(sideB, rectangle.sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }
}