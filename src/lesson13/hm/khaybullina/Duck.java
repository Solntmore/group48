package lesson13.hm.khaybullina;

import java.util.Objects;

public abstract class Duck {
    private String name;
    private double weight;
    private int age;
    private String color;

    public Duck(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public abstract void swim();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Double.compare(weight, duck.weight) == 0 && age == duck.age && Objects.equals(name, duck.name) && Objects.equals(color, duck.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, age, color);
    }

    @Override
    public String toString() {
        return "Утка: " +
                "Имя = '" + name +
                ", вес = " + weight +
                ", возраст = " + age +
                ", цвет = " + color;
    }
}


