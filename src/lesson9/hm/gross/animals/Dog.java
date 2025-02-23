package lesson9.hm.gross.animals;

import java.util.Objects;

public class Dog extends Animal {
    private boolean ball;

    public Dog(int age, double weight, boolean ball) {
        super(age, weight);
        this.ball = ball;
    }

    @Override
    public void move() {
        if (ball) {
            System.out.println("Бегу максимально быстро, чтобы поймать мяч");
        } else {
            System.out.println("Люблю обнюхивать все вокруг");
        }
    }

    @Override
    public void eat() {
        System.out.println("Кушаю все, кроме лимонов");
    }

    public void runAfterTheBall() {
        if (ball) {
            System.out.println("Люблю когда мне кидают мяч, если ловлю, несу хозяину и жду повторного броска");
        } else {
            System.out.println("Мечтаю об игре с мячом на лужайке");
        }
    }

    public void beAGoodBoy() {
        System.out.println("Моя главная задача быть хорошим мальчиком, тогда меня гладят и дают лакомства");
    }

    public boolean isBall() {
        return ball;
    }

    public void setBall(boolean ball) {
        this.ball = ball;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return ball == dog.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ball);
    }

    @Override
    public String toString() {
        return "Пёс" +
                "мяч" + ball;
    }
}
