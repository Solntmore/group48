package lesson11.hm.khodorkovskiy;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //todo Задание 2: Преобразования типов. Напишите код, который выполняет следующие преобразования:

        //todo Создать целое число.
        int wholeNumber = 123;

        //todo Преобразуйте целое число int в строку String.
        String transformWholeNumber = Integer.toString(wholeNumber);

        //todo Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.
        int backWholeNumber = Integer.parseInt(transformWholeNumber);

        //todo Преобразуйте вещественное число double в целое число int с потерей дробной части.
        double numberWithFractionalPart = 4.5;
        int transformFromDouble = (int) numberWithFractionalPart;

        //todo Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием автоупаковки.
        int[] arrayOfNumbers = {1, 2, 3, 4};
        List<Integer> list = Arrays.stream(arrayOfNumbers).boxed().toList();
    }
}
