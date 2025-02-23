package lesson13.hm.khaybullina;

public class RubberDuck extends Duck {
    public RubberDuck(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю по воде за счет материала, из которого сделан");
    }

}
