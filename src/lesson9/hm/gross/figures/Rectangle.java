package lesson9.hm.gross.figures;

import java.util.Objects;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void calculateArea() {
        int area = a * b;
        System.out.println("Площадь прямоугольника равна " + area);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "\nФигура: прямоугольник, " +
                "сторона 1 равна " + a +
                ", сторона 2 равна " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
