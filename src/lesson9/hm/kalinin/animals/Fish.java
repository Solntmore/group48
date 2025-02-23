package lesson9.hm.kalinin.animals;

class Fish extends Animal {
    public Fish() {
        super();
    }

    @Override
    public void move() {
        System.out.println("Я рыба - я плаваю");
    }
}
