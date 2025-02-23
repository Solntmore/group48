package lesson8.hm.khodorkovskiy;

import java.util.Objects;

public class Tour {
    private final String country;
    private final String city;
    private String transport;
    private int days;
    private int price;
    private int stars;
    private String food;

    public Tour(String food, int stars, int price, int days, String transport, String city, String country) {
        this.food = food;
        this.stars = stars;
        this.price = price;
        this.days = days;
        this.transport = transport;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getFood() {
        return food;
    }

    public int getStars() {
        return stars;
    }

    public int getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

    public String getTransport() {
        return transport;
    }

    public String getCity() {
        return city;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Тур: " +
                "Страна - " + country +
                ", Город - " + city +
                ", Транспорт - " + transport +
                ", Дни - " + days +
                ", Цена - " + price +
                ", Количество звезд  - " + stars +
                ", Питание - " + food;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days && price == tour.price && stars == tour.stars && Objects.equals(country, tour.country) && Objects.equals(city, tour.city) && Objects.equals(transport, tour.transport) && Objects.equals(food, tour.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, transport, days, price, stars, food);
    }
}
