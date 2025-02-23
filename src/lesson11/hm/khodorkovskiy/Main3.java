package lesson11.hm.khodorkovskiy;

public class Main3 {
    public static void main(String[] args) {
        //todo Задание 3: Работа с классами-обёртками

        //todo Создать объект класса Integer с помощью конструктора и методом valueOf().
        Integer number = new Integer(25);
        System.out.println(number);
        Integer differentNumber = 35;

        //todo Использовать метод equals() для сравнения двух объектов Integer.
        System.out.println(number.equals(differentNumber));

        //todo Применить метод parseInt() для преобразования строки в целое число.
        String string = "45";
        int convertFromString = Integer.parseInt(string);
        System.out.println(convertFromString);
    }
}
