package lesson17.hm.tumanov;

import java.util.Comparator;

public class SortByDiametrComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        return Double.compare(o2.getDiameter(), o1.getDiameter());
    }

}
