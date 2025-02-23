package lesson9.hm.kupryunina.animals;

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("Животные могут двигаться совершенно по разному, например: ");
        Animal [] animals = {cat, dog, bird};
        for (Animal animal : animals) {
            animal.toMove();
        }
    }
}
