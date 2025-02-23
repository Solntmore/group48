package lesson5.hm.tumanov;

import java.util.Scanner;

public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметр треугольника");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - овал");
        System.out.println("5 - круг");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            MathUtils.countPerimeterOfTriangle(a, b, c);

        } else if (userChoice == 2) {
            System.out.print("Введите длину стороны квадрата: ");
            int a = scanner.nextInt();

            MathUtils.countPerimeterOfSquare(a);

        } else if (userChoice == 3) {
            System.out.print("Введите длину первого основания (a): ");
            int a = scanner.nextInt();

            System.out.print("Введите длину второго основания (b): ");
            int b = scanner.nextInt();

            System.out.print("Введите длину первой боковой стороны (c): ");
            int c = scanner.nextInt();

            System.out.print("Введите длину второй боковой стороны (d): ");
            int d = scanner.nextInt();

            MathUtils.countPerimeterOfTrapezoid(a, b, c, d);

        } else if (userChoice == 4) {
            System.out.print("Введите длину большой полуоси (a): ");
            int a = scanner.nextInt();

            System.out.print("Введите длину малой полуоси (b): ");
            int b = scanner.nextInt();

            MathUtils.countPerimeterOfOval(a, b);

        } else if (userChoice == 5) {
            System.out.print("Введите радиус круга: ");
            int radius = scanner.nextInt();

            MathUtils.countPerimeterOfСircle(radius);
        }
    }
}
