package lesson2.khodorkovskiy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1: У нас есть 4 числа. Вывести на консоль самое маленькое из них.
        Scanner in = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < 5; i++) {
            System.out.println("Введите " + i + " число: ");
            int number = in.nextInt();
            if (number < max) {
                max = number;
            }
        }
        System.out.println("Минимальное число из введенных: " + max);

        //Задача 2: Разместили вклад в банке на сумму 1 млн 200 000 рублей под 22% годовых.
        //1) Посчитать итоговую сумму без капитализации по итогам года.
        //2) Посчитать итоговую сумму с ежемесячной капитализацией по итогам года.
        System.out.println();
        int contribution = 1_200_000;
        int percent = 22;
        int contributionWithPercent = contribution + contribution / 100 * percent;
        System.out.println("Итоговая сумма без капитализации: " + contributionWithPercent);

        for (int month = 0; month < 12; month++) {
            contribution = contribution + contribution / 100 * percent / 12;
        }
        System.out.println("\nИтоговая сумма вклада с ежемесячной капитализацией: " + contribution);
    }
}