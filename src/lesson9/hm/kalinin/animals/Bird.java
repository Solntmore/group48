package lesson9.hm.kalinin.animals;

class Bird extends Animal {

    public Bird() {
        super();
    }

    @Override
    public void move() {
        System.out.println("Я птица - я летаю");
    }
}
