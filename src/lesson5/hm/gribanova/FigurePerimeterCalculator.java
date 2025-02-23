package lesson5.hm.gribanova;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета ее периметра (или длины окружности)");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - эллипс");
        System.out.println("5 - окружность");

        //У сканера есть режимы работы
        //System.in - читает из консоли
        //System.out - пишет в консоль

        //У сканера есть несколько способов чтения из консоли
        //nextInt() - читает int числа из консоли
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
            int sideSquare = scanner.nextInt();

            MathUtils.countPerimeterOfSquare(sideSquare);

        } else if (userChoice == 3) {
            System.out.println("Введите первое основание трапеции: ");
            int d = scanner.nextInt();

            System.out.println("Введите второе основание трапеции: ");
            int e = scanner.nextInt();

            System.out.println("Введите первую боковую сторону трапеции: ");
            int f = scanner.nextInt();

            System.out.println("Введите вторую боковую сторону трапеции: ");
            int g = scanner.nextInt();

            MathUtils.countPerimeterOfTrapezoid(d, e, f, g);

        } else if (userChoice == 4) {
            System.out.println("Введите первый диаметр: ");
            double diameter1 = scanner.nextInt();

            System.out.println("Введите второй диаметр: ");
            double diameter2 = scanner.nextDouble();

            MathUtils.countPerimeterOfOval(diameter1, diameter2);

        } else {
            System.out.println("Введите радиус окружности: ");
            double radius = scanner.nextDouble();

            MathUtils.countСircumLengthByRadius(radius);

        }

    }
}

    //Домашнее задание
    //Дописать решение для остальных фигур
    //В классе MathUtils - ТОЛЬКО МАТЕМАТИКА В МЕТОДАХ,
    // запрос данных от пользователя и вывод результата в консоль в FigurePerimeterCalculator



