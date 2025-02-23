package lesson9.hm.khodorkovskiy.animals;

import java.util.Objects;

public abstract class Animal {
    private double age;
    private double weight;

    public Animal(double age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract void toMove();

    public abstract void eat();

    public double getAge() {
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
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
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
}
