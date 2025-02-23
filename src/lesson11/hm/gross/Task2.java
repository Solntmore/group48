package lesson11.hm.gross;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //Напишите код, который выполняет следующие преобразования:
        //Преобразуйте целое число int в строку String.
        int wholeNumber = 18;
        String str = String.valueOf(wholeNumber);
        System.out.println(str);

        //Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.
        //Преобразование возможно через Integer.parseInt()(см. следующее задание) и через Integer.valueOf():
        String numericalValue = "456";
        int integral = Integer.valueOf(numericalValue);
        System.out.println(integral);

        //Преобразуйте вещественное число double в целое число int с потерей дробной части.
        Double fractionalNumber = 68.945;
        int number = fractionalNumber.intValue();
        System.out.println(number);

        //Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием автоупаковки.
        int[] array = {34, 65, 43, 30, 51};
        //Сначала преобразуем массив в список Integer
        List<Integer> futureList = Arrays.stream(array).boxed().toList();
        //Конвертируем List в ArrayList
        ArrayList<Integer> list = new ArrayList<>(futureList);
        System.out.println(list);
    }
}
