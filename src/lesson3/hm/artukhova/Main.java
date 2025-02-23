package lesson3.hm.artukhova;

public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14. " +
                "Как только цикл дойдет до 23, остановить вывод и написать в консоль “достигнуто целевое число!");

        int[] numbers = new int[31];

        for (int i = 0; i < 30; i++) {
            numbers[i] = i + 1;
        }

        for (int number : numbers) {
            if (number == 23) {
                System.out.println("Достигнуто целевое число!");
                break;
            }
            if (number % 2 == 0 && number != 6 && number != 10 && number != 14) {
                System.out.println(number);
            }
        }
//Задача 2
        System.out.println("\n2.Вывести предложение Я Java разработчик наоборот (задом наперед) в одну строку ");

        String sentence = "Я Java разработчик";
        char[] characters = sentence.toCharArray();

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.println(characters[i]);
        }
    }
}
