package lesson2.tumanov;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. " +
                "Нам нужно купить по максимуму сникерсов, и на сдачу купить конфет. " +
                "Сникерс стоит 35 руб. Конфета - 3,5 руб." +
                "Вывести на консоль сколько мы купим сникерсов?" +
                " Сколько конфет? И сколько останется сдачи? ");
        //Дано
        int summa = 1000;
        int snickersPrice = 35;
        double candyPrice =  3.5;


        // Решение
        int quantitySnickers = summa / snickersPrice;
        int remainsMoney = quantitySnickers * snickersPrice;
        int changeAfterSnickers = summa - remainsMoney;

        int quantityCandy = (int) (changeAfterSnickers / candyPrice);
        double changeAfterCandy = quantityCandy * candyPrice;
        double change = summa - remainsMoney - changeAfterCandy;

        System.out.println("Количество сникерсов = " + quantitySnickers);
        System.out.println("Количество конфет = " + quantityCandy);
        System.out.println("Остаток денег = " + change);


        System.out.println("Задача 4");
        System.out.println("У нас есть 4 числа. Вывести на консоль самое маленькое из них");

        int a = 54;
        int b = 67;
        int c = 12;
        int d = 35;
        int x = 0;

        if (a < b && a < c && a < d) x = a;
            else if (b < a && b < c && b < d) x = b;
            else if (c < a && c < b && c < d) x = c;
            else if (d < a && d < b && d < c) x = d;

        System.out.println("Маленькое число = " + x);


        System.out.println("Задача 5");
        System.out.println("Разместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.\n" +
                "         - посчитать итоговую сумму с ежемесячной капитализацией по итогам года,\n" +
                "         - посчитать итоговую сумму без капитализации по итогам года.");

        int contribution = 1_200_000;

          for (int month = 0; month < 12; month++) {
              contribution = contribution + (contribution / 100 * 22 / 12);
          }
        System.out.println("Сумма с капитализацией = " + contribution);

        int money = 1_200_000;
          money = money + (money / 100 * 22);
        System.out.println("Сумма без капитализации = " + money);
    }
}

