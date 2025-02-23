package lesson1.hm.idiyatulin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам\n" +
                "нужно купить по максимуму сникерсов, и на сдачу\n" +
                "купить конфет. Сникерс стоит 35 руб. Конфета -\n" +
                "3,5 руб.");
        //Дано
        int money = 1000;
        int coastSnickers = 35;
        double coastCandy = 3.5;

        //Решение
        int quantitySnickers = money / coastSnickers;
        int changeSnickers = money - (quantitySnickers * coastSnickers);
        int quantityCandy = (int) (changeSnickers / coastCandy);
        double changeCandy = money - ((quantitySnickers * coastSnickers) + (quantityCandy * coastCandy));
        System.out.println("Ответ:");
        System.out.println("Сникерс: " + quantitySnickers);
        System.out.println("Конфет: " + quantityCandy);
        System.out.println("Сдача: " + changeCandy);
    }
}