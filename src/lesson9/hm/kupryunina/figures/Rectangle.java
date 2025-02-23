package lesson9.hm.kupryunina.figures;

import java.util.Objects;

public class Rectangle extends Shape {
    private int width;

    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("\nРасчет площади прямоугольника");
        return 0;
    }
    public double calculateAreaOfRectangle() {
        while (true) {
            System.out.println("Площадь прямоугольника равна - " + ((getLength() * getWidth())));
            break;
        }
        return 0;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник" +
                "ширина" + width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width);
    }
}
