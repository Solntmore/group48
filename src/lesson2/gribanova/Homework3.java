package lesson2.gribanova;

public class Homework3 {
    public static void main(String[] args) {
        /*не получается диапазон сделать 1-30

        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа," +
                " кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
                "“достигнуто целевое число!");

        //Дано
        int[] range = IntStream.rangeClosed(1, 31).toArray();

        //Решение
        for (int index = 0; index < range.length; index++) {
            //Получаем число из массива
            int number = range[index];
            //Если его остаток от деления 0, то оно четное и выводим
            if (range[index] % 2 == 0) {
                System.out.println(number);
                if (number == 6) {
                    continue;
                }
                System.out.println(number);

                if (number == 10) {
                    continue;
                }
                System.out.println(number);

                if (number == 14) {
                    continue;
                }
                System.out.println(number);

            }
        }
    } */

        /*не получается убрать 6, 10, 14

        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа," +
                " кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
                "“достигнуто целевое число!");

        int[] massiv = {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29};
        for (int index = 0; index < massiv.length; index++) {
            int element = massiv[index];
            if (massiv[index] % 2 == 0) {
                System.out.println(element);

            /*} else if (massiv[index] == 7 || massiv[index] == 11 || massiv[index] == 15) {
                continue;

            } else if (element == 6) {
                continue;

            } else if (massiv[index] >= 23) {
                System.out.println("Достигнуто целевое число!");
                break;

            }

        }
    } */

            System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа," +
            " кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
            "“достигнуто целевое число!");

            int[] massiv = {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
            25, 26, 27, 28, 29};
        for (int index = 0; index < massiv.length; index++) {
        int element = massiv[index];
        if (massiv[index] % 2 == 0 && massiv[index] != 6 && massiv[index] != 10 && massiv[index] != 14) {
            System.out.println(element);

            /*} else if (massiv[index] == 7 || massiv[index] == 11 || massiv[index] == 15) {
                continue; не получается*/

        } else if (element == 6) {
            continue; //не работает continue

        } else if (massiv[index] >= 23) {
            System.out.println("Достигнуто целевое число!");
            break;

        }

    }
}
}