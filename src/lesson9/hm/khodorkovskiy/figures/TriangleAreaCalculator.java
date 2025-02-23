package lesson9.hm.khodorkovskiy.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class TriangleAreaCalculator extends Shape {
    private double base;
    private double height;

    @Override
    public double shape() {
        double triangleArea = (base * height) / 2.0;
        BigDecimal roundedTriangleArea = new BigDecimal(triangleArea);
        roundedTriangleArea = roundedTriangleArea.setScale(2, RoundingMode.DOWN);
        return roundedTriangleArea.doubleValue();
    }

    public TriangleAreaCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Площадь треугольника равна: " + shape();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TriangleAreaCalculator that = (TriangleAreaCalculator) o;
        return Double.compare(base, that.base) == 0 && Double.compare(height, that.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }
}
