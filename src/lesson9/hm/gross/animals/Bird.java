package lesson9.hm.gross.animals;

import java.util.Objects;

public class Bird extends Animal {
    private boolean birdCage;

    public Bird(int age, double weight, boolean birdCage) {
        super(age, weight);
        this.birdCage = birdCage;
    }

    @Override
    public void move() {
        if (birdCage) {
            System.out.println("Перебираю лапками по перекладине, от поилки до кормушки и больше не двигаюсь");
        } else {
            System.out.println("Расправляю крылья и лечу, ищу добычу");
        }
    }

    @Override
    public void eat() {
        if (birdCage) {
            System.out.println("Кушаю специальный корм для птиц, там зернышки и иногда насекомые");
        } else {
            System.out.println("Кушаю то, что добуду, чаще всего это насекомые и мелкие животные");
        }
    }

    public void fly() {
        if (birdCage) {
            System.out.println("Летаю редко, иногда мне кажется я и вовсе не умею правильно летать");
        } else {
            System.out.println("Люблю летать, чувствовать свободу ловить ветер крыльями");
        }
    }

    public boolean isBirdCage() {
        return birdCage;
    }

    public void setBirdCage(boolean birdCage) {
        this.birdCage = birdCage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return birdCage == bird.birdCage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birdCage);
    }

    @Override
    public String toString() {
        return "Птица в " + "клетке" + birdCage + " или нет";
    }
}
