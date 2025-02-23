package lesson9.hm.gross.figures;

import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Площадь круга равна - " + "%.3f", area);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг, " +
                "радиус равен " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
