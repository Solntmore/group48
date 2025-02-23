package lesson1.hm.tatyana;

public class Main {
//psvm - для запуска метода (точка старта)
// sout - для вывода на консоль
// CTR + ALT + L - форматирование

    public static void main(String[] args) {
        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, и на сдачу купить конфет. Сникерс стоит 35 рублей. Конфета стоит 3,5 рублей." +
                "Вывести на консоль сколько мы купим сникерсов?" +
                "Сколько конфет? И сколько останется сдачи?");
        //Дано
        int money = 1000;
        int snickersPrice = 35;
        double candyPrice = 3.5;

        //Решение
        int countSnickers = money / snickersPrice;
        System.out.println("Решение:");
        System.out.println("Колличество сникерсов: " + countSnickers);
        int priceOfAllSnickers = countSnickers * snickersPrice;
        int changeFromSnickers = money - priceOfAllSnickers;
        double countCandy = (double) changeFromSnickers /  candyPrice;
        int countCandyInteger = (int) countCandy;
        System.out.println("Колличество конфет: " + countCandyInteger);
        double priceOfAllCandy = (double) countCandyInteger * candyPrice;
        double change = (double) money - (double) priceOfAllSnickers - priceOfAllCandy;
        System.out.println("Сдача : " + change);




    }
}