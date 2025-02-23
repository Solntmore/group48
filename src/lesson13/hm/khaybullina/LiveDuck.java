package lesson13.hm.khaybullina;

public class LiveDuck extends Duck implements Flyable, Quacking, Reproducing {
    public LiveDuck(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю, чтобы размять лапы");
    }

    @Override
    public void fly() {
        System.out.println("Улетаю на зимовку на юг");
    }

    @Override
    public void quack() {
        System.out.println("Крякаю, когда вижу рыбу");
    }

    @Override
    public void reproduce() {
        System.out.println("Размножаюсь, чтобы сделать потомство");
    }
}
