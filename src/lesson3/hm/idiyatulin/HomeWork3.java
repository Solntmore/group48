package lesson3.hm.idiyatulin;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6,\n" +
                "10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль\n" +
                "“достигнуто целевое число!”");

        //Подготовка тестовых данных
        int[] numbers = new int[30];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index + 1;
        }

        //Решение задачи
        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];

            if (number == 23) {
                System.out.println("достигнуто целевое число!");
                break;
            }

            if (number == 6 || number == 10 || number == 14) {
                continue;
            }

            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
