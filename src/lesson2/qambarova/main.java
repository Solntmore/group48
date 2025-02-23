package lesson2.qambarova;

public class main {
    public static void main(String[] args) {
        System.out.println("\n Домашное задание 1");
        System.out.println("\n У нас есть 4 числа. Вывести на консоль самое маленькое из них");

        int a = 3;
        int b = 2;
        int c = 5;
        int d = 1;
        int minimum = a;

        if (b < minimum) {
            minimum = b;
        }if (c < minimum) {
            minimum = c;
        }if (d < minimum) {
            minimum = d;
        }
            System.out.println( "Самое маленкое число " + minimum);



        System.out.println("\n Домашное задание 2");
        System.out.println("\n Разместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.\n" +
                "- посчитать итоговую сумму с ежемесячной капитализацией по итогам года,\n" +
                "- посчитать итоговую сумму без капитализации по итогам года.");

         int deposit = 1_200_000;
         for (int monthly = 0; monthly < 12; monthly++) {
             deposit = deposit+ (deposit /100*22/12);
             System.out.println("Ежемесечное итог сумми " + deposit);
         }
        int money = 1_200_000;
         for (int year = 0; year < 1 ; year++) {
             money = money + (money/100*22);
             System.out.println("\nИтог сумми без капетализации  " + money);

         }
    }
}
