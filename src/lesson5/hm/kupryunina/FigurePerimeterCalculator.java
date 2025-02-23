package lesson5.hm.kupryunina;

import java.util.Scanner;

public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметра");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - овал");
        System.out.println("5 - круг");

        //у сканера есть режимы работы
        // system.in - читает из консоли
        // system.out - пишет в консоль

        // у сканера есть несколько способов чтения из консоли
        // nextInt () - читает Int числа из консоли

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону a: ");
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
            System.out.println("Введите основание a: ");
            int a = scanner.nextInt();
            System.out.println("Введите основание b: ");
            int b = scanner.nextInt();
            System.out.println("Введите боковую сторону c: ");
            int c = scanner.nextInt();
            System.out.println("Введите боковую сторону d: ");
            int d = scanner.nextInt();
            MathUtils.countPerimeterOfTrapezoid(a, b, c, d);

        } else if (userChoice == 4) {
            System.out.println("Введите малую полуось a: ");
            int a = scanner.nextInt();
            System.out.println("Введите большую полуось b: ");
            int b = scanner.nextInt();
            MathUtils.countPerimeterOfOval (a, b);

        } else {
            System.out.println("Введите радиус r: ");
            int r = scanner.nextInt();
            MathUtils.countPerimeterOfCircle (r);
        }
     }
}