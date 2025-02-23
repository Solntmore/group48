package lesson5.hm.qambarova;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class FigurePerimetrerCalculator {
    public static void main(String[] args) {
        System.out.println("\nВыберите фигуру для расчета периметр треугольника");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - овал");
        System.out.println("5 - круг");

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

            System.out.println("Введите длину стороны квадрата ");
            int a = scanner.nextInt();

            MathUtils.perimeterOfSquare(a);

        } else if (userChoice == 3) {
            System.out.print("Введите длину первого основания (a): ");
            int a = scanner.nextInt();

            System.out.print("Введите длину второго основания (b): ");
            int b = scanner.nextInt();

            System.out.print("Введите длину первой боковой стороны (c): ");
            int c = scanner.nextInt();

            System.out.print("Введите длину второй боковой стороны (d): ");
            int d = scanner.nextInt();

            MathUtils.trapezoidPerimeter(a, b, c, d);

        } else if (userChoice == 4) {

            System.out.println("Введите длину большой полуоси (a): ");
            double a = scanner.nextDouble();

            System.out.print("Введите длину малой полуоси (b): ");
            double b = scanner.nextDouble();

            MathUtils.perimeterOfEllepse(a, b);

        } else if (userChoice == 5) {
            System.out.print("Введите радиус круга (r): ");
            double radius = scanner.nextDouble();
            MathUtils.perimeterOfCircle(radius);
        }else {
            System.out.println("Выберите пожалуйста другую цифру");
        }
    }

    //Домашнее задание
    //Даписать решение для остальных фигур
    //В классе MathUtils - ТОЛЬКО МАТЕМАТИКА В МЕТОДАХ,
    // запрос данных от пользователя и вывод результата в консоль в FigurePerimeterCalculator


}