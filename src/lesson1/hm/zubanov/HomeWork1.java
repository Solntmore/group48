package lesson1.hm.zubanov;

public class HomeWork1 {
    public static void main(String[] args) {
        // ЗАДАЧА 3:
        //
        // У нас есть 1000 рублей. Мы идем в магазин.
        // Нам нужно купить по максимуму сникерсов, и на сдачу купить конфет.
        // Сникерс стоит 35 руб. Конфета - 3,5 руб.
        //
        // Вывести на консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?

        // Дано:

        int sum = 1000;
        int saleSnikers = 35;
        double saleCandy = 3.5;

        int quantityChocolate = sum / saleSnikers;
        System.out.println("Купили сникерсов: " + quantityChocolate);

        int remainder =  sum - (quantityChocolate * saleSnikers);
        System.out.println("Осталось рублей после покупки сникерсов: " + remainder);

        int quantityCandy = (int) (remainder/saleCandy);
        System.out.println("Купили конфет: " + quantityCandy);

        double change = sum - ((quantityChocolate * saleSnikers) + (quantityCandy * saleCandy));
        System.out.println("Осталось сдачи: " + change);
    }
}
