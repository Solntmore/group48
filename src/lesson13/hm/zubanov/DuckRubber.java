package lesson13.hm.zubanov;

public class DuckRubber extends Duck {
    public DuckRubber(String material) {
        super(material);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю в ванной");
    }
}
