package lesson9.hm.khodorkovskiy.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class RectangleAreaCalculator extends Shape {
    private double length;
    private double width;

    @Override
    public double shape() {
        double rectangleArea = length * width;
        BigDecimal roundedRectangleArea = new BigDecimal(rectangleArea);
        roundedRectangleArea = roundedRectangleArea.setScale(2, RoundingMode.DOWN);
        return roundedRectangleArea.doubleValue();
    }

    public RectangleAreaCalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Площадь прямоугольника равна: " + shape();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RectangleAreaCalculator that = (RectangleAreaCalculator) o;
        return Double.compare(length, that.length) == 0 && Double.compare(width, that.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
