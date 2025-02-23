package lesson13.hm.zubanov;

import java.util.Objects;

public abstract class Duck {
    private String material;

    public Duck(String material) {
        this.material = material;
    }

    public abstract void swim();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(material, duck.material);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(material);
    }

    @Override
    public String toString() {
        return "Утка" + " " +
                "материал - " + material;
    }
}
