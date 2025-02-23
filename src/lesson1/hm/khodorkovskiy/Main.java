package lesson1.hm.khodorkovskiy;

public class Main {
    public static void main(String[] args) {
        //Условие
        System.out.println("Дано: У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, " +
                "и на сдачу купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб. ");
        System.out.println("Найти: Вывести на консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется " +
                "сдачи?");
        System.out.println();

        //Решение
        int sum = 1000;
        int snikers = sum / 35;
        int change = sum - snikers * 35;
        int candies = (int) (change / 3.5);
        double finalChange = sum - snikers * 35 - candies * 3.5;

        //Ответ
        System.out.println("Ответ:");
        System.out.println("Количество сникерсов: " + snikers + " шт.");
        System.out.println("Количество конфет: " + candies + " шт.");
        System.out.println("Сдача: " + finalChange + " руб.");
    }
}