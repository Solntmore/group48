package lesson7.hm.khodorkovskiy;

import java.util.Objects;

public class Animal {
    private double height;
    private double weight;
    private final String name;
    private final String color;
    private final int pawQuantity;
    private String favoriteFood;

    public Animal(double height, double weight, String name, String color, int pawQuantity, String favoriteFood) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.pawQuantity = pawQuantity;
        this.favoriteFood = favoriteFood;
    }

    public void SayWeight() {
        String sayWeight = "Мой вес " + getWeight() + " кг";
        System.out.println(sayWeight);
    }

    public void SayHeight() {
        String sayHeight = "Мой рост " + getHeight() + " м.";
        System.out.println(sayHeight);
    }

    public void Introduce() {
        String introduce = "Меня зовут " + getName();
        System.out.println(introduce);
    }

    public void SayYourColor() {
        String sayYourColor = "Я " + getColor() + " цвета";
        System.out.println(sayYourColor);
    }

    public void SayPawQuantity() {
        String sayPawQuantity = "У меня " + getPawQuantity() + " лапы";
        System.out.println(sayPawQuantity);
    }

    public void SayFavoriteFood() {
        String sayFavoriteFood = "Моя любимая еда - " + getFavoriteFood();
        System.out.println(sayFavoriteFood);
    }


    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawQuantity() {
        return pawQuantity;
    }

    @Override
    public String toString() {
        return "Меня зовут - " + name +
                ", мой рост - " + height + " м." +
                ", мой вес - " + weight + " кг." +
                ", у меня " + color + " цвет, "
                + pawQuantity + " лапы," +
                " любимая еда " + favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(height, animal.height) == 0 && Double.compare(weight, animal.weight) == 0 && pawQuantity
                == animal.pawQuantity && Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(favoriteFood, animal.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name, color, pawQuantity, favoriteFood);
    }
}

