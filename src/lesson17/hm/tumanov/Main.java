package lesson17.hm.tumanov;
import java.util.Comparator;
import java.util.Set;
import  java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2, 1999, 2.5, "Gold");
        Coin coin2 = new Coin(5, 1999, 4.5, "Gold");
        Coin coin3 = new Coin(10, 1990, 3.5, "Gold");
        Coin coin4 = new Coin(6, 1899, 5, "Olovo");
        Coin coin5 = new Coin(4, 1869, 10, "Silver");
        Coin coin6 = new Coin(8, 1869, 10, "Zmetall");

        Set<Coin> coins = new TreeSet<>(new SortByDiametrComparator());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
        System.out.println(" ");

        coins = new TreeSet<>(new SortByYearComparator());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
        System.out.println(" ");

        coins = new TreeSet<>(new SortByMetalComparator());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
        System.out.println(" ");

        coins = new TreeSet<>(new SortByDenominationComparator());
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
    Set<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
        @Override
        public int compare(Coin o1, Coin o2) {
            if (!o1.getMetalName().equals(o2.getMetalName())) {
                return o1.getMetalName().compareTo(o2.getMetalName());
            }

            if (o1.getNominal() != o2.getNominal()) {
                return o1.getNominal() - o2.getNominal();
            }
            return Double.compare(o1.getDiameter(), o2.getDiameter());
        }
    });
}
