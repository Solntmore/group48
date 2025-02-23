package lesson3.hm.tumanov;

public class HomeWork {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("\n1.Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14. " +
                "Как только цикл дойдет до 23, остановить вывод и написать в консоль “достигнуто целевое число!”.");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];
            if (numbers[index] % 2 == 0) {
                if (numbers[index] == 6) {
                    continue;
                }
                if (numbers[index] == 10) {
                    continue;
                }
                if (numbers[index] == 14) {
                    continue;
                }
                System.out.println(number);
                if (number == 22) {
                    System.out.println("Достигнуто целевое число!");
                    break;
                }
            }
        }
    }
}
