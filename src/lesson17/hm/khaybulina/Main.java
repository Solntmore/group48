package lesson17.hm.khaybulina;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 1999, 2.5, "Gold");
        Coin coin2 = new Coin(5, 1999, 3.5, "Gold");
        Coin coin3 = new Coin(5, 1996, 4.5, "Gold");
        Coin coin4 = new Coin(50, 1899, 5, "Olovo");
        Coin coin5 = new Coin(50, 1866, 10, "Silver");
        Coin coin6 = new Coin(10, 1866, 7, "Zmetall");

        //Вариант 1 - используем сортировку по умолчанию (метод compareTo для Comparable объектов)
//        Set<Coin> coins = new TreeSet<>();
        //Вариант 2 - используем внешний компаратор (сравниватель) реализованный в виде отдельного класса
        // Set<Coin> coins = new TreeSet<>(new SortByYearComparator());
        //Вариант 3 - используем внешний компаратор (сравниватель) реализованный в виде анонимного класса
        Set<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //Сначала сортируем по металлу (по алфавиту от Я до А, от Z до A)
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                //Потом сортируем по номиналу (от большего к меньшему)
                if (o2.getNominal() != o1.getNominal()) {
                    return Integer.compare(o2.getNominal(), o1.getNominal());
                }

                //Потом сортируем по диаметру (от меньшего к большему)
                return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }
}
