package lesson9.hm.gross.animals;

import java.util.Objects;

public abstract class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract void move();

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }

    @Override
    public String toString() {
        return "Животное, возрастом " + age + "года, и весом " + weight + "кг";
    }
}
