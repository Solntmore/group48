package lesson8.hm.kalinin;

import java.util.Objects;

public class Tour {
    private final String country;
    private final String city;
    private String transport;
    private int days;
    private int price;
    private int stars;
    private String food;

    public Tour(String country, String city, String transport, int days, int price, int stars, String food) {
        this.country = country;
        this.city = city;
        this.transport = transport;
        this.days = days;
        this.price = price;
        this.stars = stars;
        this.food = food;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Ваш тур - " + " " +
                "Страна: " + country + ";" + " " +
                "Город: " + city + ";" + " " +
                "Транспорт: " + transport + ";" + " " +
                "Дни: " + days + ";" + " " +
                "Цена: " + price + ";" + " " +
                "Звёзды: " + stars + ";" + " " +
                "Питание: " + food;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days && price == tour.price && stars == tour.stars && Objects.equals(country, tour.country)
                && Objects.equals(city, tour.city) && Objects.equals(transport, tour.transport)
                && Objects.equals(food, tour.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, transport, days, price, stars, food);
    }
}
