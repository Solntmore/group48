package lesson3.hm.khodorkovskiy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Задать массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14" +
                "\n          Как только цикл дойдет до 23, остановить вывод и написать в консоль “достигнуто целевое число!.");
        //Наполняем массив числами от 1-30
        int[] numbers = new int[31];
        for (int index = 1; index < numbers.length; index++) {
            numbers[index] = index;
        }
        //Выводим на печать необходимые данные
        for (int indexToPrint = 1; indexToPrint < numbers.length; indexToPrint++) {
            if (numbers[indexToPrint] % 2 != 0) {
                continue;
            } else if (numbers[indexToPrint] == 6) {
                continue;
            } else if (numbers[indexToPrint] == 10) {
                continue;
            } else if (numbers[indexToPrint] == 14) {
                continue;
            } else if (numbers[indexToPrint] == 24) {
                System.out.println("Достигнуто целевое число!");
                return;
            } else {
                System.out.println(numbers[indexToPrint]);
            }
        }

    }
}
