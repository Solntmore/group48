package lesson7.hm.kalinin;

import java.util.Objects;

public class Animals {
    private final String name;
    private int height;
    private int weight;
    private final String color;
    private final int quantityOfPaws;
    private String likeFood;

    public Animals(String name, String color, int quantityOfPaws) {
        this.name = name;
        this.color = color;
        this.quantityOfPaws = quantityOfPaws;
        this.likeFood = "unknown";
    }

    public void introduce() {
        System.out.println("\nПривет, меня зовут " + name + "  мой рост " + height + "м." + "  я вешу " + weight
                + "кг." + "  мой цвет " + color + "  у меня " + quantityOfPaws + " лапы" + "  моя любимая еда "
                + likeFood);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLikeFood(String likeFood) {
        this.likeFood = likeFood;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public String getLikeFood() {
        return likeFood;
    }

    public String getName() {
        return name;
    }

    public int getQuantityOfPaws() {
        return quantityOfPaws;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Животное - " +
                "моё имя: " + name + " " +
                "мой рост: " + height + "м. " +
                "мой вес: " + weight + "кг. " +
                "мой цвет: " + color + " " +
                "у меня " + quantityOfPaws + " лапы " +
                "моя любимая еда: " + likeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //сравниваем самим с собой
        if (o == null || getClass() != o.getClass()) return false; //проверяем на null и тип
        Animals animals = (Animals) o;
        return height == animals.height && weight == animals.weight && quantityOfPaws == animals.quantityOfPaws
                && Objects.equals(name, animals.name) && Objects.equals(color, animals.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, color, quantityOfPaws);
    }
}