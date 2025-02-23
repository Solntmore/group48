package lesson9.hm.khaybulina.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nВыберите фигуру для расчета площади: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Треугольник");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Введите радиус круга: ");
                double radiusCircle = scanner.nextDouble();
                shape = new Circle(radiusCircle);
                System.out.println("Площадь круга: " + shape.calculateArea() + " см.");
                break;

            case 2:
                System.out.println("Введите ширину прямоугольника: ");
                double widthRectangle = scanner.nextDouble();
                System.out.println("Введите длину прямоугольника: ");
                double lengthRectangle = scanner.nextDouble();
                shape = new Rectangle(widthRectangle, lengthRectangle);
                System.out.println("Площадь прямоугольника: " + shape.calculateArea() + " см.");
                break;

            case 3:
                System.out.println("Введите основание треугольника: ");
                double footingTriangle = scanner.nextDouble();
                System.out.println("Введите высоту треугольника: ");
                double heightTriangle = scanner.nextDouble();
                shape = new Triangle(footingTriangle, heightTriangle);
                System.out.println("Площадь треугольника: " + shape.calculateArea() + " см.");
                break;

            default:
                System.out.println("Такой фигуры нет! Пожалуйста, выберите фигуру из списка (1-3).");
        }
    }
}

