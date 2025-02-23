package lesson13.hm.mikhail;

public class Rubberduck extends Ducks{
    public Rubberduck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю так себе");

    }
}
