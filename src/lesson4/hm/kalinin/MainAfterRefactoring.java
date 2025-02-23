package lesson4.hm.kalinin;

public class MainAfterRefactoring {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание:\n" +
                "1) Создать массив 6 на 6 сразу с числами;\n" +
                "2) Перезаписать во все ячейки нули (0);\n" +
                "3) Вывести диагональ сверху вниз;\n" +
                "4) Вывести в шахматном порядке.");

        int[][] array = {
                {4, 19, 38, 42, 22, 5},
                {6, 98, 31, 66, 2, 19},
                {55, 8, 52, 41, 30, 2},
                {99, 102, 88, 77, 44, 66},
                {62, 1, 0, 35, 48, 96},
                {10, 14, 41, 25, 9, 8}
        };

        System.out.println("\nПерезаписываем во все ячейки нули (0): ");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                array[verticalIndex][horizontalIndex] = 0;
                int number = array[verticalIndex][horizontalIndex];
                System.out.print(number);
            }
        }

        System.out.println("\nВыводим числа в массиве по диагонали сверху вниз:");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalindex = 0; horizontalindex < nestedArray.length; horizontalindex++) {
                if (verticalIndex + horizontalindex == 5) {
                    int number = array[verticalIndex][horizontalindex];
                    System.out.print(number);
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nВывод чисел массива в шахматном порядке:");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if ((verticalIndex + horizontalIndex) % 2 == 1) {
                    int number = array[verticalIndex][horizontalIndex];
                    System.out.print(number);
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}