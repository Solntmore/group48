package lesson1.hm.nizamov;

public class Main {
    public static void main(String[] args) {
        String longText = """
                 У нас есть 1000 рублей.
                 Мы идем в магазин. Нам нужно купить по максимуму сникерсов,
                 и на сдачу купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб.
                """;
        System.out.println("Условие : " + longText);
        System.out.println("Дано: 1000 рублей и знание цены, сникерс = 35 руб. Конфета - 3,5 руб");
        String longText2 = """
                Шаг 1: Рассчитаем количество сникерсов
                Шаг 2: Рассчитаем потраченные деньги на сникерсы
                Шаг 3: Рассчитаем сдачу
                Шаг 4: Рассчитаем количество конфет
                """;
        System.out.println("Решение: " + longText2);
        System.out.println("Результат решения задачи");
        double money = 1000;
        double thePriceOfSnickers = 35;
        double thePriceOfCandy = 3.5;
        //Шаг 1: Рассчитаем количество сникерсов
        int quantitySnickers = (int) (money / thePriceOfSnickers);
        System.out.println("1: количество сникерсов = " + quantitySnickers);
        //Шаг 2: Рассчитаем потраченные деньги на сникерсы
        double moneySpent = quantitySnickers * thePriceOfSnickers;
        System.out.println("2: потраченные деньги на сникерсы = " + moneySpent);
        //Шаг 3: Рассчитаем сдачу
        double handingOverMoney = money - moneySpent;
        System.out.println("3: Сдача = " + handingOverMoney);
        //Шаг 4: Рассчитаем количество конфет
        int amountOfCandies = (int) (handingOverMoney / thePriceOfCandy);
        System.out.println("4: количество купленных конфет = " + amountOfCandies);
    }
}
