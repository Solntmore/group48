package lesson5.hm.khaybulina;

import java.util.Scanner;

public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметра: ");
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
            System.out.println("Введите сторону квадрата: ");
            int a = scanner.nextInt();

            System.out.println(MathUtils.countPerimeterOfSquare(a));

        } else if (userChoice == 3) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            System.out.println("Введите сторону d: ");
            int d = scanner.nextInt();

            System.out.println(MathUtils.countPerimeterOfTrapezoid(a, b, c, d));

        } else if (userChoice == 4) {
            System.out.println("Введите полуось а: ");
            int a = scanner.nextInt();

            System.out.println("Введите полуось b: ");
            int b = scanner.nextInt();

            System.out.println(MathUtils.countPerimeterOfOval(a, b));

        } else {
            System.out.println("Введите радиус r : ");
            int r = scanner.nextInt();

            System.out.println(MathUtils.countPerimeterOfCircle(r));
        }
    }
}