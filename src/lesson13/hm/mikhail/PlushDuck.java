package lesson13.hm.mikhail;

public class PlushDuck extends Ducks implements Quack {
    public PlushDuck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю плохо");

    }

    @Override
    public void quack() {
        System.out.println("Крякаю слабо");
    }
}
