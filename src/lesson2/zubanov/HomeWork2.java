package lesson2.zubanov;

public class HomeWork2 {
    public static void main(String[] args) {
        // Домашнее задание
        // 1) У нас есть 4 числа. Вывести на консоль самое маленькое из них
        // 2) Разместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.
        //         - посчитать итоговую сумму с ежемесячной капитализацией по итогам года,
        //         - посчитать итоговую сумму без капитализации по итогам года.

        System.out.println("У нас есть 4 числа. Вывести на консоль самое маленькое из них");
        int a = 35;
        int b = 36;
        int c = 37;
        int d = 15;
        if (a < b && a < c && a < d) {
            System.out.println("Самое маленькое число: " + a);
        }

        if (b < a && b < c && b < d) {
            System.out.println("Самое маленькое число: " + b);
        }

        if (c < a && c < b && c < d) {
            System.out.println("Самое маленькое число: " + c);
        }

        if (d < a && d < b && d < c) {
            System.out.println("Самое маленькое число: " + d);
        }

        System.out.println("\nРазместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.");
        System.out.println("- посчитать итоговую сумму с ежемесячной капитализацией по итогам года");
        System.out.println("- посчитать итоговую сумму без капитализации по итогам года");

        int money = 1_200_000;
        for (int month = 0; month < 12; month++) {
            money = money + (money / 100 * 22 / 12);
        }
        System.out.println("Итоговая сумма с ежемесячной капитализацией: " + money);
        int money2 = 1_200_000;
        money2 = money2 + (money2 / 100 * 22);
        System.out.println("Итоговая сумма без капитализации: " + money2);
    }
}
