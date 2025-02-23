package lesson13.hm.kalinin;

class AliveDuck extends Duck implements Quack, Flying {

    public static void reproduce() {
        System.out.println("\nЖивая утка умеет размножается");
    }

    @Override
    public void swim() {
        System.out.println("\nЖивая утка умеет грациозно летать");
    }

    @Override
    public void quack() {
        System.out.println("\nЖивая утка мило крякает");
    }

    @Override
    public void fly() {
        System.out.println("\nЖивая утка летает");
    }
}
