package lesson9.hm.kalinin.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            printResult();
        }
    }

    private static void printResult() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("\nВвведите радиус круга (см)");
                String inputRadius = scanner.next();
                inputRadius = inputRadius.replace(',', '.');
                double radius = Double.parseDouble(inputRadius);
                Shape circle = new Circle(radius);
                System.out.println("\nПлощадь круга = " + circle.calculateArea() + " см2");
                break;
            }
            case 2: {
                System.out.println("\nВведите длину стороны А (см)");
                String inputSideA = scanner.next();
                inputSideA = inputSideA.replace(',', '.');
                double sideA = Double.parseDouble(inputSideA);
                System.out.println("Введите длину стороны В (см)");
                String inputSideB = scanner.next();
                inputSideB = inputSideB.replace(',', '.');
                double sideB = Double.parseDouble(inputSideB);
                Shape rectangle = new Rectangle(sideA, sideB);
                System.out.println("\nПлощадь прямоугольника = " + rectangle.calculateArea() + " см2");
                break;
            }
            case 3: {
                System.out.println("\nВведите длину основания треугольника (см)");
                String inputLenghtBase = scanner.next();
                inputLenghtBase = inputLenghtBase.replace(',', '.');
                double lenghtBase = Double.parseDouble(inputLenghtBase);
                System.out.println("Введите высоту треугольника (см)");
                String inputHeight = scanner.next();
                inputHeight = inputHeight.replace(',', '.');
                double height = Double.parseDouble(inputHeight);
                Shape triangle = new Triangle(lenghtBase, height);
                System.out.println("\nПлощаль треугольника = " + triangle.calculateArea() + " см2");
                break;
            }
            case 0: {
                System.exit(0);
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nВыберите фигуру для расчета площади");
        System.out.println("1 - круг");
        System.out.println("2 - прямоугольник");
        System.out.println("3 - треугольник");
        System.out.println("0 - выйти из программы");
    }
}