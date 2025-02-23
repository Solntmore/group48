package lesson3.hm.gribanova;

public class Homework3New {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа," +
                " кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
                "“достигнуто целевое число!");

        //Дано
        int[] massiv = {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29};

        //Решение
        System.out.println("\nРешение:");
        for (int index = 0; index < massiv.length; index++) {
            int element = massiv[index];

            if (element >= 23) {
                System.out.println("Достигнуто целевое число!");
                break;
            }

            if (element % 2 == 1 || element == 6 || element == 10 || element == 14) {
                continue;
            }

            if (element % 2 == 0) {
                System.out.println(element);
            }
    }
}
}
