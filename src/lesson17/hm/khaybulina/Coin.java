package lesson17.hm.khaybulina;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private double diameter;
    private String metalName;


    public Coin(int nominal, int year, double diameter, String metalName) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.metalName = metalName;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetalName() {
        return metalName;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && Objects.equals(metalName, coin.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, metalName, diameter);
    }

    @Override
    public String toString() {
        return "Монета: " +
                "Номинал = " + nominal +
                ", год = " + year +
                ", металл = '" + metalName +
                ", диаметр = " + diameter;
    }

    @Override
    public int compareTo(Coin o) {
        //Сначала сортируем по диаметру
        if ((this.diameter != o.diameter))
            return Double.compare(this.diameter, o.diameter);

        //Сначала сортируем по номиналу
        if (this.nominal != o.nominal) {
            return o.nominal - this.nominal;
        }

        //Потом сортируем по году
        if (this.year != o.year) {
            return this.year - o.year;
        }

        //Потом сортируем по металлу
        return this.metalName.compareTo(o.metalName);
    }
}

