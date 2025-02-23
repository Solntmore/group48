package lesson13.hm.mikhail;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Liveduck liveduck = new Liveduck("Клава", 10, "коричневый");
        PlushDuck plushDuck = new PlushDuck("Муся", 5, "зеленый");
        Rubberduck rubberduck = new Rubberduck("Даша", 3, "синий");

        ArrayList<Ducks> ducks = new ArrayList<>();
        ducks.add(liveduck);
        ducks.add(plushDuck);
        ducks.add(rubberduck);
        for (Ducks duck : ducks) {
            System.out.println("\n" +"Меня зовут" + " " +  duck.getName());
            duck.swim();
            if (duck instanceof Quack) {
                Quack quack = (Quack) duck;
                quack.quack();

            }
            if (duck instanceof Flyable) {
                Flyable flyable = (Flyable) duck;
                flyable.fly();

            }
            if (duck instanceof Multiply){
                Multiply multiply = (Multiply)duck;
                multiply.givebirth();

            }

        }
    }
}
