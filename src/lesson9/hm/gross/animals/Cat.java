package lesson9.hm.gross.animals;

public class Cat extends Animal {

    public Cat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void move() {
        System.out.println("Двигаюсь плавно и мягко, чтобы не вспугнуть воображаемую добычу");
    }

    @Override
    public void eat() {
        System.out.println("Предпочитаю кушать свежее мясо");
    }

    public void lookAtTheOwnerWithContempt() {
        System.out.println("Бросаю на хозяина едкий и презрительный взгляд, чтобы понимал, кто здесь " +
                "действительно хозяин");
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
