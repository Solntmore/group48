package lesson13.hm.zubanov;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Duck duckLive = new DuckLive("живая");
        Duck duckPlush = new DuckPlush("плюшевая");
        Duck duckRubber = new DuckRubber("резиновая");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(duckLive);
        ducks.add(duckPlush);
        ducks.add(duckRubber);

        for (Duck duck : ducks) {
            System.out.println("\n" + duck.toString());
            duck.swim();

            if (duck instanceof Multiplying) {
                Multiplying multiplying = (Multiplying) duck;
                multiplying.multiply();
            }

            if (duck instanceof Quacking) {
                Quacking quacking = (Quacking) duck;
                quacking.quack();
            }
        }
    }
}
