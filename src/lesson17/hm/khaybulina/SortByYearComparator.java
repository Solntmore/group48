package lesson17.hm.khaybulina;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        // Сначала сортируем по диаметру в порядке убывания
        if (o1.getDiameter() != o2.getDiameter())
            return Double.compare(o2.getDiameter(), o1.getDiameter());

        //Потом сортируем по году в порядке возрастания
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }

        //Потом сортируем по металлу (по алфавиту от А до Я, от A до Z)
        if (!o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }

        //Потом сортируем по номинал в порядке возрастания
        return o1.getNominal() - o2.getNominal();
    }
}


