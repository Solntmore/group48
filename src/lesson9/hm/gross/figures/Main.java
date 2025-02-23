package lesson9.hm.gross.figures;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        Rectangle rectangle = new Rectangle(4, 8);
        Triangle triangle = new Triangle(9, 5);

        System.out.println("\nДемонстрация методов расчета площади фигур:");
        System.out.println(circle);
        circle.calculateArea();
        System.out.println(rectangle);
        rectangle.calculateArea();
        System.out.println(triangle);
        triangle.calculateArea();
    }
}
