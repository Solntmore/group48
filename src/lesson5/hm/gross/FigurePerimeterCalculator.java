package lesson5.hm.gross;

import java.util.Scanner;
/**
 * Калькулятор периметров фигур
 */
public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметра:");
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

            int perimeter = MathUtils.countPerimeterOfTriangle(a, b, c);
            System.out.println(perimeter);

        } else if (userChoice == 2) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            int perimeter = MathUtils.countPerimeterOfSquare(a);
            System.out.println(perimeter);

        } else if (userChoice == 3) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            System.out.println("Введите сторону d: ");
            int d = scanner.nextInt();

            int perimeter = MathUtils.contPerimeterOfTrapezoid(a, b, c, d);
            System.out.println(perimeter);

        } else if (userChoice == 4) {
            System.out.println("Ведите больший радиус: ");
            int largeRadius = scanner.nextInt();

            System.out.println("Введите малый радиус: ");
            int smallRadius = scanner.nextInt();

            double perimeter = MathUtils.contPerimeterOfEllipse(largeRadius, smallRadius);
            System.out.println(perimeter);

        } else if (userChoice == 5) {
            // Поставила else if, а не else, так как при вводе любой цифры после 4 (8, 10, 18 и т.д.) считается
            // периметр круга, что не совсем логично исходя из условий.
            System.out.println("Введите радиус круга r: ");
            int r = scanner.nextInt();

            double perimeter = MathUtils.contLengthOfCircumference(r);
            System.out.println(perimeter);

        } else {
            System.out.println("Выберете фигуру и укажите одно из чисел от 1 до 5");
        }
    }
}

