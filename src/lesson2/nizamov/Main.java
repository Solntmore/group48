package lesson2.nizamov;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nУ нас есть 4 числа. Вывести на консоль самое маленькое из них");
        //Для начала зададим любые 4 числа
        int firstNumber = 33;
        int secondNumber = 28;
        int thirdNumber = 35;
        int fourthNumber = 13;

        //Находим минимальное число
        int min = firstNumber;
        //Предположили, что первое число минимальное

        if (secondNumber < min) {
            min = secondNumber;
        }
        //Обновляем если второе число меньше

        if (thirdNumber < min) {
            min = thirdNumber;
        }
        //Обновляем если третье число меньше

        if (fourthNumber < min) {
            min = fourthNumber;
        }
        //Обновляем если четвертое число меньше

        System.out.println("\nМинимальное число : " + min);

        //Задача вторая!
        System.out.println("\nРазместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых." + "\n- посчитать итоговую сумму с ежемесячной капитализацией по итогам года,"
                + "\n- посчитать итоговую сумму без капитализации по итогам года.");
        double money = 1200000;
        //считаем итоговую сумму без капитализации.

        double sum1 = (money / 100 * 22 + money);

        System.out.println("Итог без капитализации = " + sum1);

        //считаем итоговую сумму с капитализацией.
        //sum2 - месячная ставка
        //year - годичный период(месяцы)

        double sum2 = (money * 0.22 / 12);
        double year = 12;

        double factor = 1;
        for (int a = 0; a < year; a++) {
            factor *= (1 + sum2);
        }

        double finish = money * factor;
        System.out.println("Итог с капитализацией = " + finish);
    }
}
