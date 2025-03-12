package lesson17.hm.idiyatullin;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private double diameter;
    private String metalName;

    public Coin(int nominal, int year, double diameter, String metalName) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
        this.metalName = metalName;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }
    public int getNominal() {
        return nominal;
    }

    public int getYear() {
        return year;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getMetalName() {
        return metalName;
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
        return Objects.hash(nominal, year, diameter, metalName);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", diameter=" + diameter +
                ", metalName='" + metalName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        //Сначала сортируем по номиналу
        if (this.nominal != o.nominal) {
            return o.nominal - this.nominal;
        }

        //Потом сортируем по году
        if (this.year != o.year) {
            return this.year - o.year;
        }

        //Потом сортируем по металлу
        if (!this.metalName.equals(o.metalName)) {
            return this.metalName.compareTo(o.metalName);
        }

        //потом сортируем по диаметру
        return Double.compare(this.diameter, o.diameter);
    }
}
