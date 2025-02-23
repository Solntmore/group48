package lesson9.hm.khodorkovskiy.animals;

public class Bird extends Animal {
    public Bird(double age, double weight) {
        super(age, weight);
    }

    @Override
    public void toMove() {
        System.out.println("Быстро летаю");
    }

    @Override
    public void eat() {
        System.out.println("Пью нектар");
    }

    public void toFly() {
        System.out.println("Я летаю быстро размахиваю крыльями");
    }

    @Override
    public String toString() {
        return "Я красивая птичка колибри";
    }
}
