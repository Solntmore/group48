package lesson13.hm.gross;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LiveDuck liveDuck = new LiveDuck("Акка", "коричневая", 8);
        PlushDuck plushDuck = new PlushDuck("Лалафанфан", "розовый", false);
        RubberDuck rubberDuck = new RubberDuck("Истребитель", "желтый");

        //При добавлении нового вида утки, через new создаем новый объект, далее, через метод add, добавляем его в массив
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(liveDuck);
        ducks.add(plushDuck);
        ducks.add(rubberDuck);

        //Демонстрация всех уток, а также метода абстрактного класса.
        //Можно было бы и интерфейс создать, но так как любая новая утка будет иметь положение в пространстве, этот
        //метод будет актуален для всех, значит можем его записать в абстрактный класс.
        for (Duck duck : ducks) {
            System.out.println("\n" + duck.getName() + ". " + duck);
            duck.toRest();

            //Демонстрация работы интерфейсов. Новый вид, при наличии у него одного или нескольких интерфейсов ниже,
            // будет описан автоматически.
            if (duck instanceof Breeding) {
                Breeding breeding = (Breeding) duck;
                breeding.breed();
            }
            if (duck instanceof Flyable) {
                Flyable flyable = (Flyable) duck;
                flyable.fly();
            }

            if (duck instanceof Quacking) {
                Quacking quacking = (Quacking) duck;
                quacking.quack();
            }

            if (duck instanceof Swimming) {
                Swimming swimming = (Swimming) duck;
                swimming.swim();
            }
        }
    }
}
