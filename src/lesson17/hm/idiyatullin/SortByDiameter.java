package lesson17.hm.idiyatullin;

import java.util.Comparator;

public class SortByDiameter implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {

        if (o1.getDiameter() > o2.getDiameter()) {
            return o1.getDiameter() > o2.getDiameter() ? -1 : 1;
        }

        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }

        if (!o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }

        return o1.getNominal() - o2.getNominal();
    }
}
