package lesson5.hm.khodorkovskiy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Создание метода
 * 1 - модификатор доступа (слово определяющее область видимости метода)
 * public - доступен внутри всего проекта
 * protected - доступен только внутри текущей папки и наследникам текущего класса
 * package - дефолтный, если ничего не ставить, будет он по умолчанию, доступ только внутри текущей папки
 * private - доступен только внутри текущего класса
 * <p>
 * Где можно ставить модификатор доступа:
 * - перед классом
 * - перед методом
 * - перед полем класса (состояние)
 * <p>
 * Опционально
 * может быть или не быть
 * 2 static - делает метод статическим
 * <p>
 * 3 Метод может возвращать значение или нет
 * указываем тип возвращаемого значения (int, String, etc..)
 * или ничего не возвращает, тогда указываем void
 * <p>
 * 4 название метода
 * <p>
 * Опционально
 * может быть или не быть
 * 5 входящие параметры (Всегда в () через, и с указанием типа и названия (String text, int number)
 * <p>
 * 6 тело выполнения данного метода (его логика)
 **/
public class MathUtils {
    public static int countPerimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static double countAreaOfTriangle(int a, int h) {
        return (a * h) / 2.0;
    }

    public static int countPerimeterOfSquare(int a, int b) {
        return (a + b) * 2;
    }

    public static int countPerimeterOfTrapezium(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double countPerimeterOfEllipse(int a, int b) {
        double perimeter = 2.0 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2.0);
        BigDecimal roundedPerimeter = new BigDecimal(perimeter);
        roundedPerimeter = roundedPerimeter.setScale(2, RoundingMode.DOWN);
        return roundedPerimeter.doubleValue();

    }

    public static double countLengthOfCircle(int r) {
        return 2.0 * Math.PI * r;

    }
}

