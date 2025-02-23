package lesson1.hm.khaybullina;

public class Main {
    public static void main(String[] args) {
        //У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, и на сдачу купить конфет. Сникерс стоит 35 рублей.Конфета-3.5 руб. Вывести на консоль, сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?

        System.out.println();
        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, и на сдачу купить конфет.");
        System.out.println("Сникерс стоит 35 рублей.Конфета-3.5 руб. Вывести на консоль, сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?");

        //Дано
        int ourMoney = 1000;
        int snickersPrice = 35;
        double candyPrice = 3.5;

        //Решение
        int quantityOfSnickers = (int) (ourMoney / snickersPrice);
        int changeFromSnickers = (int) ourMoney - (quantityOfSnickers * snickersPrice);
        int quantityOfCandy = (int) (changeFromSnickers / candyPrice);
        double change = (int) changeFromSnickers - (quantityOfCandy * candyPrice);

        //Вывод в консоль
        System.out.println();
        System.out.println("Сколько мы купим сникерсов?");
        System.out.println("Ответ:" + quantityOfSnickers);
        System.out.println();
        System.out.println("Сколько мы купим конфет?");
        System.out.println("Ответ:" + quantityOfCandy);
        System.out.println();
        System.out.println("Сколько останется сдачи?");
        System.out.println("Ответ:" + change);
    }
}



