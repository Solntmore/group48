package lesson4.hm.nizamov;

public class Main2 {
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

        // Перезаписываем все ячейки массива нулями
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0; // Присваиваем 0 каждой ячейке
            }
        }

        // Выводим массив после перезаписи
        System.out.println("Массив после перезаписи в 0:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " "); // Выводим элемент массива

            }
        }
    }
}
