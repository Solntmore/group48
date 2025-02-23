package lesson9.hm.khodorkovskiy.animals;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Cat extends Animal{
    private boolean amIHungry;

    public Cat(double age, double weight, boolean amIHungry) {
        super(age, weight);
        this.amIHungry = amIHungry;
    }

    public void lookWithContemptAtTheOwner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Покормил ли меня хозяин? Введите true или false - ");
        boolean fitTheCat = scanner.nextBoolean();

        if (fitTheCat != amIHungry) {
            System.out.println("Давайте быстрее покормите меня");
        } else {
            System.out.println("Я сыт. Смотрю с призрением на хозяина");
        }
    }

    @Override
    public void toMove() {
        System.out.println("Точу когти о диван");
    }

    @Override
    public void eat() {
        System.out.println("Рыбка - это вкусно");
    }

    public boolean isAmIHungry() {
        return amIHungry;
    }

    public void setAmIHungry(boolean amIHungry) {
        this.amIHungry = amIHungry;
    }

    @Override
    public String toString() {
        return "Я вечно голодный кот Васька";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return amIHungry == cat.amIHungry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amIHungry);
    }
}
