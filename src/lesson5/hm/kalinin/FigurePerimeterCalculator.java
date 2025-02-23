package lesson5.hm.kalinin;

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
        // 1................................................
        // 2,5 ... олег ... 5723428 ... авапвапвап
        if (userChoice == 1) {
            System.out.println("Введите сторону треугольника а: ");
            scanner.nextLine();
            String sideA = scanner.nextLine();
            sideA = sideA.replace(',', '.');
            double a = Double.parseDouble(sideA);

            //Реализовали возможность введения дробного числа как через запятую, так и через точку

            System.out.println("Введите сторону треугольника b: ");
            String sideB = scanner.next();
            sideB = sideB.replace(',', '.');
            double b = Double.parseDouble(sideB);

            System.out.println("Введите сторону треугольника c: ");
            String sideC = scanner.next();
            sideC = sideC.replace(',', '.');
            double c = Double.parseDouble(sideC);

            MathUtils.countPerimeterOfTriangle(a, b, c);

        } else if (userChoice == 2) {
            System.out.println("Введите сторону квадрата: ");
            String side = scanner.next();
            side = side.replace(',', '.');
            double a = Double.parseDouble(side);

            MathUtils.countPerimeterOfQuadrant(a);

        } else if (userChoice == 3) {
            System.out.println("Введите сторону трапеции а: ");
            String sideA = scanner.next();
            sideA = sideA.replace(',', '.');
            double a = Double.parseDouble(sideA);

            System.out.println("Введите сторону трапеции b: ");
            String sideB = scanner.next();
            sideB = sideB.replace(',', '.');
            double b = Double.parseDouble(sideB);

            System.out.println("Ведите сторону трапеции с: ");
            String sideC = scanner.next();
            sideC = sideC.replace(',', '.');
            double c = Double.parseDouble(sideC);

            System.out.println("Введите сторону трапеции d: ");
            String sideD = scanner.next();
            sideD = sideD.replace(',', '.');
            double d = Double.parseDouble(sideD);

            MathUtils.countPerimeterOfTrapezoid(a, b, c, d);

        } else if (userChoice == 4) {
            System.out.println("Введите длину оси A: ");
            String axisA = scanner.next();
            axisA = axisA.replace(',', '.');
            double a = Double.parseDouble(axisA);

            System.out.println("Введите длину оси B: ");
            String axisB = scanner.next();
            axisB = axisB.replace(',', '.');
            double b = Double.parseDouble(axisB);

            MathUtils.countPerimeterOfEllipse(a, b);

        } else if (userChoice == 5) {
            System.out.println("Введите диаметр круга:");
            String diameter = scanner.next();
            diameter = diameter.replace(',', '.');
            double D = Double.parseDouble(diameter);

            MathUtils.countPerimeterOfCircle(D);
        }
    }
}