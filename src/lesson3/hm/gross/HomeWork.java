package lesson3.hm.gross;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10," +
                " 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль: достигнуто целевое число!");
        //Не написано, что число 30 - включительно.
        int[] numbersArray = new int[30];
        for (int index = 1; index < numbersArray.length; index++) {
            numbersArray[index] = index;
            int number = numbersArray[index];
            if (number % 2 == 0 && number != 6 && number != 10 && number != 14) {
                System.out.println(number);
            }
            if (number == 23) {
                break;
            }
        }
        System.out.println("Достигнуто целевое число!");
    }
}

