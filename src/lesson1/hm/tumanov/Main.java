package lesson1.hm.tumanov;

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
        int remainsMoney = summa / quantitySnickers;
        int quantituCandy = (int) (remainsMoney / candyPrice);
        double channge = (double) (remainsMoney / quantituCandy);

          System.out.println("Количество сникерсов = " + quantitySnickers);
          System.out.println("Количество конфет = " + quantituCandy);
         System.out.println("Сдача = " + channge);
    }
}