package lesson7.hm.khaybullina;

import java.util.Objects;

public class Animal {
    private final String name;
    private double height;
    private double weight;
    private final String color;
    private final int numberOfPaws;
    private String favoriteFood;

    public Animal(String name, double height, double weight, String color, int numberOfPaws, String favoriteFood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.favoriteFood = favoriteFood;
    }

    public void sayName(){
        System.out.println("- Меня зовут " + name + ";");
    }

    public void sayHeight(){
        System.out.println("- Мой рост " + height + " см;");
    }

    public void sayWeight(){
        System.out.println("- Мой вес " + weight + " кг;");
    }

    public void sayColor(){
        System.out.println("- Я " + color + " цвета;");
    }

    public void sayNumberOfPaws(){
        System.out.println("- У меня " + numberOfPaws + " лапы;");
    }

    public void sayFavoriteFood(){
        System.out.println("- Моя любимая еда - " + favoriteFood + " .");
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(height, animal.height) == 0 && Double.compare(weight, animal.weight) == 0 && numberOfPaws == animal.numberOfPaws && Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(favoriteFood, animal.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, color, numberOfPaws, favoriteFood);
    }
}
