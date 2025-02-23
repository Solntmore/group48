package lesson9.hm.khodorkovskiy.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета площади: ");
        System.out.println("1 - круг");
        System.out.println("2 - прямоугольник");
        System.out.println("3 - треугольник");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите радиус круга: ");
            double radius = scanner.nextDouble();

            CircleAriaCalculator circleAriaCalculator = new CircleAriaCalculator(radius);
            System.out.println(circleAriaCalculator);
        } else if (userChoice == 2) {
            System.out.println("Введите длину прямоугольника: ");
            double length = scanner.nextDouble();

            System.out.println("Введите ширину прямоугольника: ");
            double width = scanner.nextDouble();

            RectangleAreaCalculator rectangleAreaCalculator = new RectangleAreaCalculator(length, width);
            System.out.println(rectangleAreaCalculator);
        } else {
            System.out.println("Введите основание треугольника: ");
            double base = scanner.nextDouble();

            System.out.println("Введите высоту треугольника: ");
            double height = scanner.nextDouble();

            TriangleAreaCalculator triangleAreaCalculator = new TriangleAreaCalculator(base, height);
            System.out.println(triangleAreaCalculator);
        }
    }
}