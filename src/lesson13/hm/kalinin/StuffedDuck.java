package lesson13.hm.kalinin;

class StuffedDuck extends Duck implements Quack {

    @Override
    public void swim() {
        System.out.println("\nПлюшевая утка очень плохо плавает");
    }

    @Override
    public void quack() {
        System.out.println("\nПлюшевая утка крякает не как живая");
    }
}
