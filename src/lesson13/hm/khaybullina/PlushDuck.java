package lesson13.hm.khaybullina;

public class PlushDuck extends Duck implements Quacking {
    public PlushDuck(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю, если кинут в воду");
    }

    @Override
    public void quack() {
        System.out.println("Крякаю, когда нажимают на кнопку");
    }
}
