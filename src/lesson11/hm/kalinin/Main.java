package lesson11.hm.kalinin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1: Определение типов данных
        //Для каждого из приведенных ниже выражений определите, к какому типу данных оно
        //относится (примитивному или ссылочному)

        System.out.println("\nЗадание 1: определение типов данных");

        System.out.println("\nint x = 10 - относится к примитивному типу данных");

        System.out.println("\nString str = \"Hello\" - относится к ссылочному типу данных");

        System.out.println("\nboolean isTrue = true - относится к примитивному типу данных");

        System.out.println("\ndouble d = 3.14 - относится к примитивному типу данных");

        System.out.println("\nInteger i = new Integer(20) - относится к ссылочному типу данных");

        System.out.println("\nArrayList<Integer> list = new ArrayList<>() - относится к ссылочному типу данных");

        System.out.println("\nchar c = 'a' - относится к примитивному типу данных");

        System.out.println("\nfloat f = 2.718f - относится к примитивному типу данных");

        //Задание 2: преобразование типов
        // Напишите код, который выполняет следующие преобразования:
        // - Преобразуйте целое число int в строку String.
        // - Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.
        // - Преобразуйте вещественное число double в целое число int с потерей дробной части.
        // - Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием
        //автоупаковки.

        System.out.println("\nЗадание 2: преобразование типов");

        int num = 10;
        String str = String.valueOf(num);
        int num2 = Integer.parseInt(str);
        System.out.println("\n" + num2);

        double num3 = 12.58;
        int num4 = (int) num3;
        System.out.println("\n" + num4);

        Integer[] number = {13, 28, 37, 44, 59};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(number));
        System.out.println("\n" + list);

        //Задание 3: Работа с классами-обёртками
        //Создайте программу, которая демонстрирует работу с классами-обёртками. Программа должна выполнять следующее:
        // - cоздать объект класса Integer с помощью конструктора и методом valueOf().
        // - использовать метод equals() для сравнения двух объектов Integer.
        // - применить метод parseInt() для преобразования строки в целое число.

        System.out.println("\nЗадание 3: Работа с классами-обёртками");

        Integer int1 = new Integer("96"); // не ошибка, но не совсем верно с точки зрения оптимизации кода
        Integer int2 = Integer.valueOf(96);
        if (int1.equals(int2)) {
            System.out.println("\n" + int1 + " равен " + int2);
        } else {
            System.out.println("\n" + int1 + " не равен " + int2);
        }

        String str2 = "86";
        int num5 = Integer.parseInt(str2);
        System.out.println("\n" + num5);
    }
}