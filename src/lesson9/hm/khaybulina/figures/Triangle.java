package lesson9.hm.khaybulina.figures;

import java.util.Objects;

public class Triangle extends Shape {
    private double height;
    private double footing;

    public Triangle(double height, double footing) {
        this.height = height;
        this.footing = footing;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * footing;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFooting() {
        return footing;
    }

    public void setFooting(double footing) {
        this.footing = footing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(height, triangle.height) == 0 && Double.compare(footing, triangle.footing) == 0;
    }

    @Override
    public String toString() {
        return "Треугольник: " +
                "Высота = " + height + " см." +
                ", Основание=" + footing + " см.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, footing);
    }
}
