package lesson5.hm.kupryunina;

import java.util.Scanner;

public class FigureSquareCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета площади");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - овал");
        System.out.println("5 - круг");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите основание d: ");
            int d = scanner.nextInt();
            System.out.println("Введите высоту h: ");
            int h = scanner.nextInt();
            MathUtils.countAreaOfTriangle(d, h);

            } else if (userChoice == 2) {
            System.out.println("Введите сторону квадрата: ");
            int a = scanner.nextInt();
            MathUtils.countAreaOfSquare(a);
        } else if (userChoice == 3) {
            System.out.println("Введите основание a: ");
            int a = scanner.nextInt();
            System.out.println("Введите основание b: ");
            int b = scanner.nextInt();
            System.out.println("Введите высоту h: ");
            int h = scanner.nextInt();
            MathUtils.countAreaOfTrapezoid(a, b, h);

        } else if (userChoice == 4) {
            System.out.println("Введите малую полуось a: ");
            int a = scanner.nextInt();
            System.out.println("Введите большую полуось b: ");
            int b = scanner.nextInt();
            MathUtils.countAreaOfOval(a, b);
        } else {
            System.out.println("Введите длину окружности d: ");
            int d = scanner.nextInt();
            MathUtils.countAreaOfCircle(d);
        }
    }
}