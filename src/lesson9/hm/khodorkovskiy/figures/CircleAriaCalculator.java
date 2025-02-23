package lesson9.hm.khodorkovskiy.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class CircleAriaCalculator extends Shape {
    private double radius;

    @Override
    public double shape() {
        double circleArea = Math.PI * radius * radius;
        BigDecimal roundedCircleArea = new BigDecimal(circleArea);
        roundedCircleArea = roundedCircleArea.setScale(2, RoundingMode.DOWN);
        return roundedCircleArea.doubleValue();
    }

    public CircleAriaCalculator(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Площадь круга равна: " + shape();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CircleAriaCalculator that = (CircleAriaCalculator) o;
        return Double.compare(radius, that.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
