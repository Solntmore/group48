package lesson3.hm.kalinin;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 3-2. Вывести предложение “Я Java разработчик” наоборот (задом наперед)" +
                " в одну строку");

        //Вариант с использованием метода StringBuffer()
        //Программа буферизует входную строку с использованием метода StringBuffer(), реверсирует буфер и
        //затем преобразует буфер в String с помощью метода toString()

        String str = "Я Java разработчик";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nВариант №1: " + reverse);


        //Вариант с использованием метода toCharArray - строка переводится в массив, в котором буквы преобразуются
        // в числа, а затем массив выводится в обратном порядке
        System.out.println("\nВариант №2:");
        char[] reverseArray = str.toCharArray();
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }
    }
}