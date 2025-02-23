package lesson2.khaybullina;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. У нас есть 4 числа. Вывести на консоль самое маленькое из них.");

        int number1 = 4;
        int number2 = 4;
        int number3 = 3;
        int number4 = 1;

        int minNumber = number1;

        if (number2 < minNumber) {
            minNumber = number2;
        }

        if (number3 < minNumber) {
            minNumber = number3;
        }

        if (number4 < minNumber) {
            minNumber = number4;
        }

        System.out.println("Самое маленькое число: " + minNumber);

        System.out.println("\nЗадача 2.Разместили вклад в банке на сумму 1 млн 200 тыс руб. под 22% годовых." +
                "\n\n1) Посчитать итоговую сумму с ежемесячной капитализацией по итогам года;");
        int money = 1_200_000;

        for (int month = 1; month <= 12; month++) {
            money = (int) (money + (money * 1.83 / 100));
        }
        System.out.println("Ответ: " + money + " рублей. ");

        System.out.println("\n2) Посчитать итоговую сумму без капитализации по итогам года.");
        int money2 = 1_200_000;
        money2 = money2 + (money2 * 22 / 100);
        System.out.println("Ответ: " + money2 + " рублей.");
    }
}