package lesson9.hm.kupryunina.figures;

public class Triangle extends Shape {
    private int height;

    public Triangle(int length, int height) {
        super(length);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.println("\nРасчет площади треугольника");
        return 0;
    }
    public double calculateAreaOfTriangle() {
        while (true) {
            System.out.println("Площадь треугольника равна - " + ((getLength() * getHeight()) / 2));
            break;
        }
        return 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Треугольник: " +
                "высота, " + height;
    }
}
