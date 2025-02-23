package lesson9.hm.gross.animals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(8, 5.4);
        Animal dogWithBall = new Dog(4, 15.0, true);
        Animal dog = new Dog(12, 20.2, false);
        Animal birdInCage = new Bird(2, 0.45, true);
        Animal bird = new Bird(5, 8.3, false);

        System.out.println("\nСоздаем массив, и вызываем индивидуальные методы классов Cat, Dog, Bird.");
        Animal[] animals = {cat, dogWithBall, dog, birdInCage, bird};
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println("Кот. Параметров всего два, объект 1, перегрузки метода нет.");
                Cat catFromArray = (Cat) animal;
                catFromArray.lookAtTheOwnerWithContempt();
            } else if (animal instanceof Dog) {
                System.out.println("\nПёс. В зависимости от параметра ball (true/false) метод runAfterTheBall() " +
                        "ведет себя по разному. Что, я так понимаю, и есть перегрузка метода в полиморфизме");
                Dog dogFromArray = (Dog) animal;
                dogFromArray.beAGoodBoy();
                dogFromArray.runAfterTheBall();
            } else if (animal instanceof Bird) {
                System.out.println("\nПтица. В зависимости от параметра birdCage метод fly() воспроизводится в " +
                        "консоль по разному.");
                Bird birdFromArray = (Bird) animal;
                birdFromArray.fly();
            }
        }
        //Вывела отдельно, что бы в консоли не было каши.
        System.out.println("\nПереопределение методов move() b eat() из абстрактного класса Animal для каждого из " +
                "созданных животных,а также перегрузка методов в зависимости от наличия или отсутствия мяча для пса, " +
                "и клетки для птицы");
        for (Animal animal : animals) {
            animal.move();
            animal.eat();
        }
    }
}