package lesson5.hm.khaybulina;

public class MathUtils {
    public static void countPerimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println(perimeter);
    }

    //Задача - создать метод, который считает площадь треугольника по основанию и высоте, и вернуть значение в место вызова
    public static double countAreaOfTriangle(int a, int h) {
        double area = (a * h) / 2.0;
        return area;
    }

    //Задача - создать метод, который считает периметр квадрата и вернуть значение в место вызова
    public static int countPerimeterOfSquare(int a) {
        return a * 4;
    }

    //Задача - создать метод, который считает периметр трапеции по 4 - м сторонам и вернуть значение в место вызова
    public static int countPerimeterOfTrapezoid(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //Задача - создать метод, который считает периметр овала через полуоси и вернуть значение в место вызова
    public static double countPerimeterOfOval(int a, int b) {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2.0);
    }

    //Задача - создать метод, который считает периметр круга (длину окружности) и вернуть значение в место вызова
    public static double countPerimeterOfCircle(int r) {
        return 2 * Math.PI * r;
    }
}

