package lesson4.hm.khodorkovskiy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1: Создаём массив 6 на 6 сразу с числами");
        int[][] arraySixToSix = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36},
        };
        System.out.println("Созданный нами массив");
        for (int verticalNumbers = 0; verticalNumbers < arraySixToSix.length; verticalNumbers++) {
            for (int horizontalNumbers = 0; horizontalNumbers < arraySixToSix.length; horizontalNumbers++) {
                System.out.print(arraySixToSix[verticalNumbers][horizontalNumbers] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗадача 2: Перезаписываем во все ячейки нули");
        System.out.println("Массив со всеми нулями");
        for (int zeroVerticalIndex = 0; zeroVerticalIndex < arraySixToSix.length; zeroVerticalIndex++) {
            for (int zeroHorizontalIndex = 0; zeroHorizontalIndex < arraySixToSix.length; zeroHorizontalIndex++) {
                arraySixToSix[zeroVerticalIndex][zeroHorizontalIndex] = 0;
                System.out.print(arraySixToSix[zeroVerticalIndex][zeroHorizontalIndex] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗадача 3: Вывести диагональ сверху вниз слева направо");
        System.out.println("Диагональ массива");
        for (int diagonalVerticalIndex = 0; diagonalVerticalIndex < arraySixToSix.length; diagonalVerticalIndex++) {
            for (int diagonalHorizontalIndex = 0; diagonalHorizontalIndex < arraySixToSix.length; diagonalHorizontalIndex++) {
                if (diagonalVerticalIndex == diagonalHorizontalIndex) {
                    int diagonalElement = arraySixToSix[diagonalVerticalIndex][diagonalHorizontalIndex];
                    System.out.print(diagonalElement + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nЗадача 4: Вывести массив в шахматном порядке");
        System.out.println("Массив в шахматном порядке");
        for (int chessVerticalIndex = 0; chessVerticalIndex < arraySixToSix.length; chessVerticalIndex++) {
            for (int chessHorizontalIndex = 0; chessHorizontalIndex < arraySixToSix.length; chessHorizontalIndex++) {
                if ((chessVerticalIndex + chessHorizontalIndex) % 2 == 0) {
                    int chessElement = arraySixToSix[chessVerticalIndex][chessHorizontalIndex];
                    System.out.print(chessElement);
                    ;
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}