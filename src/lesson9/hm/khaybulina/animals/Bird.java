package lesson9.hm.khaybulina.animals;

public class Bird extends Animal {

    public Bird(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void toMove() {
        System.out.println("Двигаюсь (улетаю) с места, когда чувствую опасность.");
    }

    @Override
    public void toEat() {
        System.out.println("Люблю есть червяков, которые особенно много вылезают после дождя.");
    }

    public void toFly() {
        System.out.println("Улетаю на зиму в теплые края.");
    }
}
