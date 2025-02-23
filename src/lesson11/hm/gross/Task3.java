package lesson11.hm.gross;

public class Task3 {
    public static void main(String[] args) {
        //Создать объект класса Integer с помощью конструктора
        //Этот конструктор редко бывает целесообразным использовать, valueOf(int) обычно является лучшим выбором
        Integer integerObject = new Integer(42);

        //Создать объект класса Integer методом valueOf()
        Integer secondIntegerObject = Integer.valueOf(42);

        //Использовать метод equals() для сравнения двух объектов Integer. Сравнение по содержанию.
        if (integerObject.equals(secondIntegerObject)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        //Либо:
        boolean matching = integerObject.equals(secondIntegerObject);
        System.out.println("Равны ли объекты: " + matching);

        //Применить метод parseInt() для преобразования строки в целое число.
        String number = "387";
        int wholeNumber = Integer.parseInt(number);
        System.out.println(wholeNumber);
    }
}
