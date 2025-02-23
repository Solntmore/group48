package lesson3.hm.murzina;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, " +
                "кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
                "(достигнуто целевое число!).");
        //создаем массив
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index]; {
                if (numbers[index] % 2 == 0) {
                    if (number == 6 || number == 10 || number == 14) {
                        continue;
                    }
                    if (number >= 23) {
                        break;
                    }
                    System.out.println(number);
                }
            }
        }
        System.out.println("достигнуто целевое число!");

        System.out.println("\nЗадача 2. Вывести предложение 'Я Java разработчик' наоборот (задом наперед) в одну строку");

        var word = "Я Java разработчик";
        var reversed = new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(reversed);
    }
}