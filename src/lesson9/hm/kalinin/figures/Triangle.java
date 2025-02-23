package lesson9.hm.kalinin.figures;

import java.util.Objects;

class Triangle extends Shape {
    private double lengthBase;
    private double height;

    public Triangle(double height, double lengthBase) {
        this.height = height;
        this.lengthBase = lengthBase;
    }

    @Override
    public double calculateArea() {
        return (lengthBase * height) / 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLengthBase() {
        return lengthBase;
    }

    public void setLengthBase(double lengthBase) {
        this.lengthBase = lengthBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(lengthBase, triangle.lengthBase) == 0 && Double.compare(height, triangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthBase, height);
    }
}