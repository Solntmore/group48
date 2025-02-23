package lesson3.hm.qambarova;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Урок 3го");
        System.out.println("Есть массив чисел от 1 до 30. Вывести на консоль все чётные числа, кроме 6, 10,14." +
                " Как только цикл дойдёт до 23, остановить вывод и написать в консоль 'Достигнута цулевое числа!");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int i = 1; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 2 == 0) {

                if (number == 6 || number == 10 || number == 14) {
                    continue;
                }
                
                if (number >= 23) {
                    System.out.println("Достигли целевое числа!");
                    break;
                }
                System.out.println(numbers[i]);
            }
        }

        System.out.println("\nЗадача 2 ");
        System.out.println("Вывести предложение 'Я Java разработчик' наоборот в одну строку");
    }
}