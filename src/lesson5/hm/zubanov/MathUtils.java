package lesson5.hm.zubanov;


import static java.lang.Math.sqrt;

/**
 * Создание метода
 * 1 - модификатор доступа (слово определяющее область видимости метода)
 * public - доступен внутри всего проекта
 * protected - доступен только внутри текущей папки и наследникам текущего класса
 * package - дефолтный, если ничего не ставить, будет он по умолчанию, доступ только внутри текущей папки
 * private - доступен только внутри текущего класса
 *
 * Где можно ставить модификатор доступа:
 * - перед классом
 * - перед методом
 * - перед полем класса (состояние)
 *
 * опционально
 * может быть или не быть
 * 2 static - делает метод статическим
 *
 * 3 Метод может возвращать значение или нет
 * указываем тип возвращаемого значения (int, String, etc..)
 * или ничего не возвращает, тогда указываем void
 *
 * 4 название метода
 *
 *  опционально
 *  может быть или не быть
 * 5 входящие параметры (Всегда в () через, и с указанием типа и названия (String text, int number)
 *
 * 6 тело выполнения данного метода (его логика)
 *
 *
 *
 */
public class MathUtils {

    //Задача - создать метод, который посчитает периметр треугольника по 3-м сторонам и выведет ее в консоль

    /**
     * Метод расчета площади треугольника
     * @param a сторона а
     * @param b сторона b
     * @param c сторона c
     */
    public static void countPerimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println("Периметр треугольника равен: " + perimeter);
    }

    //Задача - создать метод, который считает площадь треугольника по основанию и высоте,
    // и вернуть значение вместо вызова
    public static double countAreaOfTriangle(int a, int h) {
        double area = (a * h) / 2.0;
        return area;
    }
    public static void countPerimeterOfSquare(int a) {
        int perimeter = a * 4;
        System.out.println("Периметр квадрата равен: " + perimeter);
    }
    public static void countPerimeterOfTrapezoid(int a, int b, int c, int d) {
        int perimeter = a + b + c + d;
        System.out.println("Периметр трапеции равен: " + perimeter);
    }
    public static void countPerimeterOfEllipse(int a, int b) {
        double perimeter =  2 * 3.14 * Math.sqrt(a * a + b * b) / 2;
        System.out.println("Периметр эллипса равен: " + perimeter);
    }
    public static void countPerimeterOfСircle(int r) {
        double perimeter = 2 * 3.14 * r;
        System.out.println("Периметр круга равен: " + perimeter);
    }
}
