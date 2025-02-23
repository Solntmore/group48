package lesson2.artuhova;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1: ");
        System.out.println("У нас есть 4 числа. Вывести на консоль самое маленькое из них");

        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;

        int min = number1;

        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }

        System.out.println("Самое маленькое число: " + min);

        //Задача 2
        System.out.println();
        System.out.println("Задача 2: ");
        System.out.println("2) Разместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.\n" +
                "         - посчитать итоговую сумму с ежемесячной капитализацией по итогам года,\n" +
                "         - посчитать итоговую сумму без капитализации по итогам года.");

        int money = 1_200_000;
        int annualRate = 22;
        double monthlyRate = (double) annualRate / 12 / 100;

        // С капитализацией
        double totalWithCapitalization = money;
        for (int i = 0; i <= 12; i++) {
            totalWithCapitalization += totalWithCapitalization * monthlyRate;
        }

        //Без капитализации
        double totalWithoutCapitalization = money + ((double) (money * annualRate) / 100);

        System.out.println("Сумма с ежемесячной капитализацией: " + totalWithCapitalization);
        System.out.println("Сумма без капитализации: " + totalWithoutCapitalization);
    }
}
