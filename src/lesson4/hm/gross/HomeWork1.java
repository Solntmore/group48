package lesson4.hm.gross;

public class HomeWork1 {
    public static void main(String[] args) {
        //1) Создать массив 6 на 6 сразу с числами
        int[][] multipleArray = {
                {1, 2, 3, 4, 5, 6,},
                {1, 2, 3, 4, 5, 6,},
                {1, 2, 3, 4, 5, 6,},
                {1, 2, 3, 4, 5, 6,},
                {1, 2, 3, 4, 5, 6,},
                {1, 2, 3, 4, 5, 6,}
        };
        for (int verticalIndex = 0; verticalIndex < multipleArray.length; verticalIndex++) {
            int[] nestedArray = multipleArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                //2) Перезаписать во все ячейки нули (0)
                multipleArray[verticalIndex][horizontalIndex] = 0;
                //3) Вывести диагональ сверху вниз
                if (verticalIndex == horizontalIndex) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nСоздать массив 6 на 6 и вывести на консоль в шахматном порядке");
        int[][] doubleArray = new int[6][6];
        for (int verticalIndex = 0; verticalIndex < doubleArray.length; verticalIndex++) {
            int[] nestedArray = doubleArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                int number = nestedArray[horizontalIndex];
                if ((verticalIndex + horizontalIndex) % 2 == 0) {
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

