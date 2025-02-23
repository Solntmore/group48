package lesson5.hm.kupryunina;
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
 * 5 входящие параметры (Всегда в () через , и с указанием типа и названия (String text, int number)
        *
        * 6 тело выполнения данного метода (его логика)
 *
         *
         *
         */

 public class MathUtils {

    // 1) Треугольник
    // Создаем метод для расчета периметра треугольника
    public static void countPerimeterOfTriangle(int a, int b, int c) {
        int Perimeter = a + b + c;
        System.out.println("Периметр треугольника равен: " + Perimeter);
    }

     // Создаем метод для расчета площади треугольника
    public static double countAreaOfTriangle(int d, int h) {
        double Area = (d * h) / 2.0;
        System.out.println("Площадь треугольника равна: " + Area);
        return Area;
    }

    // 2) Квадрат
    // Создаем метод для расчета периметра квадрата
    public static void countPerimeterOfSquare(int a) {
        int Perimeter = a + a + a + a;
        System.out.println("Периметр квадрата равен: " + Perimeter);
    }

    // Создаем метод для расчета площади квадрата
    public static void countAreaOfSquare(int a) {
        int Area = a * a;
        System.out.println("Площадь квадрата равна: " + Area);
    }

    // 3) Трапеция
    //Создаем метод для расчета периметра трапеции
    public static void countPerimeterOfTrapezoid(int a, int b, int c, int d) {
        int Perimeter = a + b + c + d;
        System.out.println("Периметр трапеции равен: " + Perimeter);
    }

    //Создаем метод для расчета площади трапеции
    public static void countAreaOfTrapezoid(int a, int b, int h) {
        int Area = (a + b)/2 * h;
        System.out.println("Площадь трапеции равна: " + Area);
    }

    // 4) Овал
    //Создаем метод для расчета периметра овала
    public static void countPerimeterOfOval(int a, int b) {
        double Perimeter = 4 * (((3.1415 * a * b) + (a - b)) / (a + b));
        System.out.println("Периметр овала равен: " + Perimeter);
    }

    //Создаем метод для расчета площади овала
    public static void countAreaOfOval(int a, int b) {
        double Area = a * b * 3.1415;
        System.out.println("Площадь овала равна: " + Area);
    }

    // 5) Круг
    //Создаем метод для расчета периметра круга
    public static void countPerimeterOfCircle(int r) {
        double Perimeter = 2 * 3.1415 * r;
        System.out.println("Периметр круга равен: " + Perimeter);
    }

    //Создаем метод для расчета площади круга
    public static void countAreaOfCircle(int d) {
        double Area = (3.1415 * d * d) / 4;
        System.out.println("Площадь круга равна: " + Area);
    }
}

