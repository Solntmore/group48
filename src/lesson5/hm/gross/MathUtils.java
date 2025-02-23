package lesson5.hm.gross;

public class MathUtils {
    /**
     * Метод расчета периметра треугольника.
     *
     * @param a сторона а
     * @param b сторона b
     * @param c сторона с
     */
    public static int countPerimeterOfTriangle(int a, int b, int c) {
        return (a + b + c);
    }

    /**
     * Метод расчета периметра квадрата.
     * В квадрате все стороны равны, поэтому используем только 1 входящий параметр.
     *
     * @param a сторона а
     */
    public static int countPerimeterOfSquare(int a) {
        return (a * 4);
    }

    /**
     * Метод расчета периметра трапеции.
     *
     * @param a сторона а
     * @param b сторона b
     * @param c сторона с
     * @param d сторона d
     */
    public static int contPerimeterOfTrapezoid(int a, int b, int c, int d) {
        return (a + b + c + d);
    }

    /**
     * Метод расчета периметра овала (эллипса).
     * В геометрии при расчете используют R при обозначении большого радиуса и r при обозначении малого радиуса.
     * Так как мы себе такого позволить не может, посчитала, что будет понятнее, если переменные будут с
     * "говорящими" названиями для улучшения восприятия происходящего.
     * Свойство Math.PI возвращает число Пи с 15-ю знаками после запятой.
     *
     * @param largeRadius большой радиус
     * @param smallRadius малый радиус
     */
    public static double contPerimeterOfEllipse(int largeRadius, int smallRadius) {
        return (4 * (Math.PI * largeRadius * smallRadius + (largeRadius - smallRadius) * (largeRadius -
                smallRadius)) / (largeRadius + smallRadius));
    }

    /**
     * Метод расчета периметра круга (длина окружности)
     * Свойство Math.PI возвращает число Пи с 15-ю знаками после запятой.
     *
     * @param r радиус круга
     */
    public static double contLengthOfCircumference(int r) {
        return (2 * Math.PI * r);
    }
}
