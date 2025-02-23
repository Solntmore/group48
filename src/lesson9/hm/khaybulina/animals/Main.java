package lesson9.hm.khaybulina.animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, 6.8);
        Dog dog = new Dog(6, 12.8);
        Bird bird = new Bird(2, 1.8);

        //Создадим разных животных и сложим их в массив животных.
        Animal[] animals = {cat, dog, bird};

        System.out.println("\nДемонстрация полиморфизма (вызываем метод move() для каждого животного):");
        System.out.println();
        for (Animal animal : animals) {
            animal.toMove();
        }

        System.out.println("\nА теперь вызовем индивидуальные методы каждого животного:");
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("\nЭто собака:");
                Dog dogFromArray = (Dog) animal;
                dogFromArray.toRunningAfterTheBall();
                dogFromArray.toBeAGoodBoy();
            } else if (animal instanceof Bird) {
                System.out.println("\nЭто птица:");
                Bird birdFromArray = (Bird) animal;
                birdFromArray.toFly();
            } else if (animal instanceof Cat) {
                System.out.println("\nЭто кошка:");
                Cat catFromArray = (Cat) animal;
                catFromArray.toLookAtTheOwnerWithContempt();
            }

            animal.toEat();
        }
    }
}