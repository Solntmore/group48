package lesson1.hm.qambarova;

public class Main {
    public static void main(String[] args) {
        // это способ оставить коментарии
        //есть  3 стороны треугольника напечатать в консоль

        //дано
        System.out.println("Задача 1");
        System.out.println("Есть 3 стороны треугольника напечатать в консоль");

        int a = 4;
        int b = 5;
        int c = 6;

        //решение
        int perimeter = a + b + c;

        //вывод в консоль
        System.out.println( "Периметр триугольника " + perimeter);

        //Задание 2
        System.out.println();
        System.out.println("Задача 2");
        System.out.println("Есть ширина и длина стола, есть ширина и длина комнаты. Вывести на консоль, сколько таких столов влезет в комнату?");

        double tableLength = 142.5;
        double tableWidth = 100.5;
        double roomLength  = 1565.5;
        double roomWidth = 1000.5;

        double tableArea = tableLength * tableWidth;
        double roomArea = roomLength /roomWidth;

        int quantityOfTables = (int) (roomArea/tableArea);
        System.out.println("Решение; " + quantityOfTables);

        //Задача 3
        System.out.println();
        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин." +
                " Нам нужно купить по максимуму сникерсов, и на сдачу купить канфеть." +
                " Сникерс стоит 35 руб. Конфета - 3,5 руб." +
                "Вывести на консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?");

        double snickersCost = 35;
        double candyCost = 3.5;

        double quantityOfSnickers = (int) (1000/snickersCost);
        double quantityOfCandy = (int) (quantityOfSnickers/candyCost);
        System.out.println("У нас  по максимум " + quantityOfSnickers + " Сникерсов");
        System.out.println( "И на здачу " + quantityOfCandy + " канфеть");

    }
}