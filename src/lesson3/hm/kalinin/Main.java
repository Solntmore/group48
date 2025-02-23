package lesson3.hm.kalinin;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nДомашнее задание 3-1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14. " +
                "\nКак только цикл дойдет до 23, остановить вывод и написать в консоль “достигнуто целевое число!”");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];
            if (number % 2 == 0 && number != 6 && number != 10 && number != 14) {
                if (number > 23) {
                    System.out.println("\nДостигнуто целевое число!");
                    return;
                }
                System.out.println(number);
            }
        }
    }
}