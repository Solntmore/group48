package lesson9.hm.khodorkovskiy.animals;

import java.util.Objects;
import java.util.Scanner;

public class Dog extends Animal {
    private boolean throwTheBall;

    public Dog(double age, double weight, boolean throwTheBall) {
        super(age, weight);
        this.throwTheBall = throwTheBall;
    }

    @Override
    public void toMove() {
        System.out.println("Люблю бегать за палкой");
    }

    @Override
    public void eat() {
        System.out.println("Сегодня я съел большой кусок мяса");
    }

    public void runTheBall() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите поиграть с собакой? Введите true или false - ");
        boolean playTheDog = scanner.nextBoolean();

        if (playTheDog != throwTheBall) {
            System.out.println("Давай поиграем, бросай мяч");
        } else {
            System.out.println("Люблю бегать за мячом.");
        }
    }

    public void toBeGoodDog() {
        System.out.println("Я хорошая собака");
    }

    public boolean isThrowTheBall() {
        return throwTheBall;
    }

    public void setThrowTheBall(boolean throwTheBall) {
        this.throwTheBall = throwTheBall;
    }

    @Override
    public String toString() {
        return "Люблю бегать в парке";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return throwTheBall == dog.throwTheBall;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), throwTheBall);
    }
}
