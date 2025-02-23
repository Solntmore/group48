package lesson9.hm.gross.figures;

public class Triangle extends Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    void calculateArea() {
        double area = (a * h) / 2.0;
        System.out.println("Площадь треугольника равна " + area);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник, " +
                "сторона равна " + a +
                ", высота равна " + h;
    }
}
