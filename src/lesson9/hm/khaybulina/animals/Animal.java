package lesson9.hm.khaybulina.animals;

import java.util.Objects;

public abstract class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract void toMove();

    public abstract void toEat();

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
        return "Animal{" + "age=" + age + ", weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(age, animal.age) == 0 && Double.compare(weight, animal.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}



