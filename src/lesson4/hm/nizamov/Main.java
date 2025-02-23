package lesson4.hm.nizamov;

public class Main {
    public static void main(String[] args) {
        // Создаем массив 6x6 и сразу заполняем его числами
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        // Выводим элементы массива на экран
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "");
                System.out.println(); // Переход на новую строку после вывода строки массива
            }
        }
    }
}
