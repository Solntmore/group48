package lesson5.hm.tumanov;

public class MathUtils {
    public static void countPerimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println(perimeter);
    }
    //Расчет периметра квадрата
    public static void countPerimeterOfSquare(int a) {
        int perimeter = 4 * a;
        System.out.println("Периметр квадрата равен: " + perimeter);
    }
    //Расчет периметра трапеции
    public static void countPerimeterOfTrapezoid(int a, int b, int c, int d) {
        int perimeter = a + b + c + d;
        System.out.println("Периметр трапеции равен: " + perimeter);
    }
    //Расчет периметра овала
    public static void countPerimeterOfOval(int a, int b) {
        double perimeter = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        System.out.println("Периметр овала равен:" + perimeter);
    }
    //Расчет периметра круга
    public static void countPerimeterOfСircle(int radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Периметр круга равен: " + perimeter);
    }
}
