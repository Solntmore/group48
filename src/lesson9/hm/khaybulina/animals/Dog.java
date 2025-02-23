package lesson9.hm.khaybulina.animals;

public class Dog extends Animal {

    public Dog(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void toMove() {
        System.out.println("Двигаюсь быстро, когда бегу за костью, которую бросил хозяин.");
    }

    @Override
    public void toEat() {
        System.out.println("Люблю есть вкусняшки, которые дает хозяин за то, что выполняю его команды.");
    }

    public void toRunningAfterTheBall() {
        System.out.println("Обожаю бегать за мячиком.");
    }

    public void toBeAGoodBoy() {
        System.out.println("Приходится быть хорошим мальчиком, чтобы меня пустили спать на кровать.");
    }
}
