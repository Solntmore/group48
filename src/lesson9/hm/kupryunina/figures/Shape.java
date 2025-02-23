package lesson9.hm.kupryunina.figures;

import java.util.Objects;
//Площадь круга Area =(L*L/ 4 * 3,1415; L - длина круга
//Площадь треугольника Area = (d * h) / 2.0; d - длина треугольника, h - высота треугольника
//Площадь прямоугольника Area = a * b ; a - длина прямоугольника, b - ширина прямоугольника

public abstract class Shape {
    private int length;

    public Shape(int length) {
        this.length = length;
    }

    public abstract double calculateArea();

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Фигура: " +
                "длина - " + length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return length == shape.length;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }
}
