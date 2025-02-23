package lesson7.hm.qambarova;

import java.util.Objects;

class Animals {
    private double height;
    private double weight;
    private String name;
    private final String color;
    private final int countOfPaws;
    private String favoriteFood;

    public Animals(String name, double height, double weight, String color, int countOfPaws, String favoriteFood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.countOfPaws = countOfPaws;
        this.favoriteFood = favoriteFood;
    }

    public void speak() {
        System.out.println("Меня зовут " + name);
        System.out.println("Мой рост: " + height + " м");
        System.out.println("Мой вес: " + weight + " кг");
        System.out.println("Мой цвет: " + color);
        System.out.println("У меня " + countOfPaws + " лап(ы)");
        System.out.println("Моя любимая еда: " + favoriteFood);

    }

    public String getColor() {
        return color;
    }

    public int getCountOfPaws() {
        return countOfPaws;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animals{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", countOfPaws=" + countOfPaws +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals1 = (Animals) o;
        return Double.compare(height, animals1.height) == 0 && Double.compare(weight, animals1.weight) == 0 && countOfPaws == animals1.countOfPaws && Objects.equals(name, animals1.name) && Objects.equals(color, animals1.color) && Objects.equals(favoriteFood, animals1.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name, color, countOfPaws, favoriteFood);
    }

}
