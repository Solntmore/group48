package lesson17.hm.tumanov;

import java.util.Comparator;

public class SortByMetalComparator implements Comparator<Coin> {

    @Override
    public  int compare(Coin o1, Coin o2) {
            return o1.getMetalName().compareTo(o2.getMetalName());

    }
}
