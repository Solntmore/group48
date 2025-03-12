package lesson17.hm.tumanov;

import java.util.Comparator;

public class SortByDenominationComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        return o1.getNominal() - o2.getNominal();
    }
}
