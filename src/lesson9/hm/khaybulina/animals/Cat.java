package lesson9.hm.khaybulina.animals;

public class Cat extends Animal {

    public Cat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void toMove() {
        System.out.println("Двигаюсь при виде мышки.");
    }

    @Override
    public void toEat() {
        System.out.println("С удовольствием ем консервы,которыми меня иногда балуют.");
    }

    public void toLookAtTheOwnerWithContempt() {
        System.out.println("Смотрю на хозяина с презрением. Это мое любимое занятие.");
    }
}
