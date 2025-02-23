package lesson1.hm.murzina;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, и на сдачу" +
                "купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб." +
                "Вывести на консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?");

        //Дано
        int sum = 1000;
        int sumSnikers = 35;
        double sumCandy = 3.5;

        //Решение
        int quantityOfSnikers = sum / sumSnikers;
        int change1 = sum - quantityOfSnikers * sumSnikers;
        int quantityOfCandies = (int) (change1 / sumCandy);
        int change2 = (int) (sum - quantityOfSnikers * sumSnikers - quantityOfCandies * sumCandy);

        System.out.println("Количество сникерсов: " + quantityOfSnikers);
        System.out.println("Количество конфет: " + quantityOfCandies);
        System.out.println("Сдача: " + change2);
    }
}