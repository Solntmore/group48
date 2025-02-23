package lesson13.hm.khaybullina;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        //Создадим уток
        //Живая утка
        //Плюшевая утка
        //Резиновая утка
        // --- Есть ли у уток какие-то общие поля состояния? ---
        // Вес
        // Возраст
        // Цвет
        // --- Есть ли общее поведение? ---
        // Плавать
        //Есть ли индивидуальное поведение?
        // Живые утки - крякать, летать, размножаться
        // Плюшевая утка - крякать

        PlushDuck plushDuck = new PlushDuck("Мартин - плюшевая утка", 3.5, 1, "Коричневая");
        LiveDuck liveDuck = new LiveDuck("Эрни - живая утка", 2.5, 7, "Пятнистая");
        RubberDuck rubberDuck = new RubberDuck("Дак - резиновая утка", 1, 5, "Желтый");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(plushDuck);
        ducks.add(liveDuck);
        ducks.add(rubberDuck);

        for (Duck duck : ducks) {
            System.out.println("\n" + duck.getName());
            duck.swim();

            if (duck instanceof Flyable) {
                Flyable flyable = (Flyable) duck;
                flyable.fly();
            }

            if (duck instanceof Quacking) {
                Quacking quacking = (Quacking) duck;
                quacking.quack();
            }

            if (duck instanceof Reproducing) {
                Reproducing reproducing = (Reproducing) duck;
                reproducing.reproduce();
            }
        }
    }
}
