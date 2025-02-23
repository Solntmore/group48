package lesson5.hm.khodorkovskiy;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметр треугольника");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - эллипс");
        System.out.println("5 - круг");

        //У сканера есть режимы работы
        //System.in - читает из консоли
        //System.out - пишет в консоль

        //У сканера есть несколько способов чтения из консоли
        //nextInt() - читает int числа из консоли
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону а треугольника: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b треугольника: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c треугольника: ");
            int c = scanner.nextInt();

            System.out.print("Периметр треугольника равен: " + MathUtils.countPerimeterOfTriangle(a, b, c));
        } else if (userChoice == 2) {
            System.out.println("Введите сторону а квадрата: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b квадрата: ");
            int b = scanner.nextInt();

            System.out.print("Периметр квадрата равен: " + MathUtils.countPerimeterOfSquare(a, b));
        } else if (userChoice == 3) {
            System.out.println("Введите сторону а трапеции: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b трапеции: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c трапеции: ");
            int c = scanner.nextInt();

            System.out.println("Введите сторону d трапеции: ");
            int d = scanner.nextInt();

            System.out.print("Периметр трапеции равен: " + MathUtils.countPerimeterOfTrapezium(a, b, c, d));
        } else if (userChoice == 4) {
            System.out.println("Введите полуось a эллипса: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b эллипса: ");
            int b = scanner.nextInt();

            System.out.print("Периметр эллипса равен: " + MathUtils.countPerimeterOfEllipse(a, b));
        } else {
            System.out.println("Введите радиус r круга: ");
            int r = scanner.nextInt();

            System.out.print("Длина окружности равна: ");
            System.out.printf("%.3f", MathUtils.countLengthOfCircle(r));
        }
    }
}

