package lesson3.hm.zubanov;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа," + " кроме 6, 10, 14. Как только цикл дойдет до 23," + " остановить вывод и написать в консоль “достигнуто целевое число!”.");

        int[] array = new int[30];
        for (int index = 1; index < 30; index++) {
            array[index] = index;
            if (index % 2 == 0) {
                if (index == 6 || index == 10 || index == 14) {
                    continue;
                }
                System.out.println(index);
            }

            if (index == 23) {
                System.out.println("достигнуто целевое число!");
                return;
            }
        }
    }
}