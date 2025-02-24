package lesson13.hm.murzina;

public class RubberDuck extends Duck {
    public RubberDuck(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю в ванной");
    }
}
