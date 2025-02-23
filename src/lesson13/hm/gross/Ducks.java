package lesson13.hm.gross;

import java.util.Objects;

public abstract class Ducks {
    private String name;
    private int age;
    private String color;

    public Ducks(String name, int age, String color) {
        this.name = name;
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
        Ducks ducks = (Ducks) o;
        return age == ducks.age && Objects.equals(name, ducks.name) && Objects.equals(color, ducks.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Ducks{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
