package lesson5.hm.kalinin;

public class MathUtils {
    public static void countPerimeterOfTriangle(double a, double b, double c) {
        double perimeter = a + b + c;
        System.out.println(perimeter);
    }

    public static void countPerimeterOfQuadrant(double a) {
        double perimeter = 4 * a;
        System.out.println(perimeter);
    }

    public static void countPerimeterOfTrapezoid(double a, double b, double c, double d) {
        double perimeter = a + b + c + d;
        System.out.println(perimeter);
    }

    public static void countPerimeterOfEllipse(double A, double B) {
        double perimeter = 2 * Math.PI * Math.sqrt((A * A + B * B) / 8);
        System.out.println(perimeter);
    }

    public static void countPerimeterOfCircle(double D) {
        double perimeter = Math.PI * D;
        System.out.println(perimeter);
    }
}
