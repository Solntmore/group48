package lesson9.hm.khodorkovskiy.animals;

public class Main {
    public static void main(String[] args) {
        Cat vaska = new Cat(3, 10, true);
        Dog bobik = new Dog(2, 20, true);
        Bird kalibri = new Bird(1, 0.5);

        System.out.println("Демонстрация методов Cat:");
        vaska.eat();
        vaska.toMove();

        System.out.println("\nДемонстрация методов Dog:");
        bobik.eat();
        bobik.toMove();

        System.out.println("\nДемонстрация методов Bird:");
        kalibri.eat();
        kalibri.toMove();


        Animal[] animals = {vaska, bobik, kalibri};
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat catFromArray = (Cat) animal;

                System.out.println("\nДемонстрация метода смотрю с призрением на хозяина класса Cat");
                catFromArray.lookWithContemptAtTheOwner();
            } else if (animal instanceof Dog) {
                Dog dogFromArray = (Dog) animal;

                System.out.println("\nДемонстрация метода бегать за мячиком класса Dog:");
                dogFromArray.runTheBall();

                System.out.println("\nДемонстрация метода быть хорошей собакой класса Dog:");
                dogFromArray.toBeGoodDog();
            } else if (animal instanceof Bird) {
                Bird birdFromArray = (Bird) animal;

                System.out.println("\nДемонстрация метода летать класса Bird:");
                birdFromArray.toFly();
            }
        }
    }
}