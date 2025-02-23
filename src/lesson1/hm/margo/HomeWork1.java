package lesson1.hm.margo;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание: Задача 3");

        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, и на " +
                "сдачу купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб. Вывести на консоль сколько мы купим " +
                "сникерсов? Сколько конфет? И сколько останется сдачи?");

        //Дано
        int costOfSnickers = 35;
        double costOfCandy = 3.5;
        int cash = 1000;

        //Решение
        int numberOfSnickers = cash / costOfSnickers;
        int changeFromSnickers = cash - (costOfSnickers * numberOfSnickers);
        int numberOfCandy = (int) (changeFromSnickers / costOfCandy);
        double changeFromCandy = changeFromSnickers - (costOfCandy * numberOfCandy);

        //Вывод в консоль
        System.out.println("Ответ:");
        System.out.println("Сникерсов - " + numberOfSnickers);
        System.out.println("Кофет - " + numberOfCandy);
        System.out.println("Останется сдачи - " + changeFromCandy);
    }
}
