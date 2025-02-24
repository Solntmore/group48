package lesson13.hm.murzina;

import java.util.Objects;

public abstract class Duck {
    private String name;
    private String color;

    public Duck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void swim();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Duck ducks = (Duck) o;
        return Objects.equals(name, ducks.name) && Objects.equals(color, ducks.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Ducks{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'';
    }
}
