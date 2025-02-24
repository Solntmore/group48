package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список:");
        List<Integer> numbers = new ArrayList<>();

        System.out.println("\nadd(E element): Добавляет элемент в конец списка.");
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(99);

        System.out.println("\nadd(int index, E element): Добавляет элемент в список на определенной позиции.");
        numbers.add(2, 15);

        System.out.println("\nremove(int index): Удаляет элемент на определенной позиции.");
        numbers.remove(3);

        System.out.println("\nset(int index, E element): Заменяет элемент на указанной позиции новым значением.");
        numbers.set(0, 99);

        System.out.println("\nget(int index): Возвращает элемент на данной позиции.");
        System.out.println("Получаю элемент с индексом 0: " + numbers.get(0));

        System.out.println("\nindexOf(Object o): Находит индекс первого вхождения данного объекта в списке.");
        System.out.println("Получаю индекс первой ячейки или единственной, в которой лежит число 99: "
                + numbers.indexOf(99));

        System.out.println("\nlastIndexOf(Object o): Находит последний индекс вхождения данного объекта в списке.");
        System.out.println("Получаю индекс последней ячейки или единственной, в которой лежит число 99: "
                + numbers.lastIndexOf(99));

        System.out.println("\nget(int index): Возвращает элемент на данной позиции.");
        System.out.println("Получаю элемент с индексом 0: " + numbers.get(0));

        System.out.println("\ncontains(Object o): Проверяет, содержит ли список данный объект.");
        System.out.println("Проверка, есть ли элемент 99 - " + numbers.contains(99));
        System.out.println("Проверка, есть ли элемент 0 - " + numbers.contains(0));

//        System.out.println("\nВыводим все элементы списка до сортировки");
//        System.out.println(numbers);

//        System.out.println("\nsort(): Сортирует элементы в списке.");
//        numbers.sort();
//
//        System.out.println("\nВыводим все элементы списка после сортировки");
//        System.out.println(numbers);

        System.out.println("\nВывод всех элементов до очистки");
        System.out.println(numbers);

        System.out.println("\nclear(): Очищает список, удаляя все его элементы.");
        numbers.clear();

        System.out.println("\nВывод всех элементов после очистки");
        System.out.println(numbers);
    }
}
