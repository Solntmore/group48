package lesson13.hm.murzina;

public class LiveDuck extends Duck implements Flyable, Quacking, Reproducible {
    public LiveDuck(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю на озере");
    }

    @Override
    public void fly() {
        System.out.println("Я высоко летаю");
    }

    @Override
    public void quack() {
        System.out.println("Я звонко крякаю");
    }

    @Override
    public void reproduce() {
        System.out.println("У меня есть детки");
    }
}
