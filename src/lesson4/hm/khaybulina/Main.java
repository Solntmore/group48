package lesson4.hm.khaybulina;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n1) Создать массив 6 на 6 сразу с числами; ");
        int[][] array = new int[6][6];

        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                array[verticalIndex][horizontalIndex] = 5;
                int number = nestedArray[horizontalIndex];
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\n2) Перезаписать во все ячейки нули (0);");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                array[verticalIndex][horizontalIndex] = 0;
                int number = nestedArray[horizontalIndex];
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\n3) Вывести диагональ сверху вниз; ");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex == horizontalIndex) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\n4) Вывести в шахматном порядке. ");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if ((verticalIndex + horizontalIndex) % 2 == 0) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}


