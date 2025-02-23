package lesson5.hm.artyukhova;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметра: ");
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

            System.out.println("Введите сторону квадрата: ");
            int a = scanner.nextInt();

            MathUtils.countPerimeterOfSquare(a);

        } else if (userChoice == 3) {

            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            System.out.println("Введите сторону d: ");
            int d = scanner.nextInt();

            MathUtils.countAreaOfTrapezoid(a, b, c, d);

        } else if (userChoice == 4) {

            System.out.println("Введите сторону а: ");
            double a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            double b = scanner.nextInt();

            MathUtils.countPerimeterOfOval(a, b);

        } else if (userChoice == 5) {

            System.out.println("Введите радиус круга: ");
            double radius = scanner.nextInt();

            MathUtils.countPerimeterOfCircle(radius);
        }
    }
}
