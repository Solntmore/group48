package lesson5.hm.gribanova;

public class MathUtils {

    /**
     * Метод расчета площади треугольника
     *
     * @param a сторона а
     * @param b сторона b
     * @param c сторона c
     */
    //Периметр треугольника
    public static void countPerimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println(perimeter);
    }

    //Задача - создать метод, который считает площадь треугольника по основанию и высоте, и вернуть значение в место вызова
    public static double countAreaOfTriangle(int a, int h) {
        double area = (a * h) / 2.0;
        return area;
    }

    //Формула рассчета периметра квадрата
    public static void countPerimeterOfSquare(int sideSquare) {
        int perimeterSquare = (sideSquare * 4);
        System.out.println(perimeterSquare);
    }

    //Периметр трапеции
    public static void countPerimeterOfTrapezoid(int d, int e, int f, int g) {
        int perimeterOfTrapezoid = d + e + f + g;
        System.out.println(perimeterOfTrapezoid);
    }

    //Формула расчета длины эллипса
    public static void countPerimeterOfOval(double diameter1, double diameter2) {
        double numberPi = 3.14;
        double perimeterOval = ((diameter1 + diameter2) / 2) * numberPi;
        System.out.println(perimeterOval);
    }

    //Формула расчета длины окружности через радиус
    public static void countСircumLengthByRadius(double radius) {
        double numberPi = 3.14;
        double perimeterCircum = 2 * numberPi * radius;
        System.out.println(perimeterCircum);
    }

    /* Не получается применить return. Сложения не происходит и окружность не считает
        public static int countPerimeterOfTrapezoid(int d, int e, int f, int g) {
        int perimeterOfTrapezoid = d + e + f + g;
        return perimeterOfTrapezoid;
    }
        public static double countСircumLengthByRadius(double radius) {
        double numberPi = 3.14;
        double perimeterCircum = 2 * numberPi * radius;
        return perimeterCircum;
    }
     */

}
