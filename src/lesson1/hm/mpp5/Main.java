package lesson1.hm.mpp5;

public class Main {
    public static void main(String[] args) {
        //Задача 3
        System.out.println();
        System.out.println("Задача 3: ");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов," +
                " и на сдачу купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб. " +
                "Сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?");
        //Дано
        int money = 1000;
        int candySnikers = 35;
        double candy = 3.5;

        int moneyAfterCandySnikers = money / candySnikers;
        int moneyAfterCandy = (int) ((money - moneyAfterCandySnikers * candySnikers) / candy);
        double moneyChange = money - (moneyAfterCandySnikers * candySnikers) - (moneyAfterCandy * candy);

        System.out.println("Мы купим " + moneyAfterCandySnikers + " сникерсов и " + moneyAfterCandy + " конфет. " +
                "Сдача будет составлять: " + moneyChange);

    }
}
