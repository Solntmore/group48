package lesson4.hm.artuykhova;

public class Main {
    public static void main(String[] args) {
        // 1) Создать массив 6 на 6 сразу с числами
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        // 2) Перезаписать во все ячейки нули (0)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }

        // 3) Вывести диагональ сверху вниз
        System.out.println("Диагональ сверху вниз:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        // 4) Вывести в шахматном порядке
        System.out.println("Шахматный порядок:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
