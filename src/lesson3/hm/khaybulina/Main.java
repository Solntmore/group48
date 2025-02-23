package lesson3.hm.khaybulina;

public class Main {
    public static void main(String[] args) {
        System.out.println("Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14." +
                "Как только цикл дойдет до 23, остановить вывод и написать в консоль “достигнуто целевое число!”.");
        int[] emptyArray = new int[30];
        for (int index = 0; index < emptyArray.length; index++) {
            emptyArray[index] = index;
        }
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            if (emptyArray[index] % 2 == 0 && emptyArray[index] != 6 && emptyArray[index] != 10 && emptyArray[index] != 14) {
                System.out.println(number);
            }

            if (emptyArray[index] >= 23) {
                System.out.println("Достигнуто целевое число!");
                break;
            }
        }
    }
}