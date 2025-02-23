package lesson4.hm.gribanova;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Создать массив с числами. Перезаписать во все ячейки нули. Вывести диагональ" +
                "слева направо в шахматном порядке");
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36},
        };

        System.out.println();
        System.out.println(array[0][0] + " " + array[1][1] + " " + array[2][2]);
        System.out.println(" " + array[3][3] + " " + array[4][4] + " " + array[5][5]);

        System.out.println("\nЗадача 2. Вывести предложение “Я Java разработчик" +
                 "\nнаоборот (задом наперед) в одну строку");

        var phrase = "Я Java разработчик";
        var reversed = new StringBuilder(phrase);
        StringBuilder reverse = reversed.reverse();
        reversed.toString();
        System.out.println(reversed);

    }


}