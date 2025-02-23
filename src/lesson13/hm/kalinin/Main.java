package lesson13.hm.kalinin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        Создай приложение, моделирующее поведение трех видов уток: живой, плюшевой и резиновой.
        Каждому виду утки присущи свои особенности, такие как способность плавать, крякать и летать.
        Живые утки умеют всё это, плюс они могут размножаться. Плюшевые утки могут только плавать и крякать, а
        резиновые утки лишь плавают.
        Используя интерфейсы и абстрактные классы, разработай модель, которая позволит легко добавить новых видов уток
        в будущем.
        Напиши тестовый класс Main, который создает экземпляры всех трех видов уток и вызывает их методы.
        */

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new AliveDuck());
        ducks.add(new StuffedDuck());
        ducks.add(new RubberDuck());

        for (Duck duck : ducks) {
            duck.swim();

            if (duck instanceof Quack) {
                ((Quack) duck).quack();
            }

            if (duck instanceof Flying) {
                ((Flying) duck).fly();
            }
        }

        AliveDuck.reproduce();
    }
}