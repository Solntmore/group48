package lesson13.hm.mikhail;

public class Liveduck extends Ducks implements Quack, Flyable,Multiply{
    public Liveduck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю быстро");
    }


    @Override
    public void quack() {
        System.out.println("Крякаю громко");
    }

    @Override
    public void fly() {
        System.out.println("Летаю высоко");

    }

    @Override
    public void givebirth() {
        System.out.println("Часто размножаюсь");

    }
}

