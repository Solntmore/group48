package lesson13.hm.zubanov;

public class DuckLive extends Duck implements Quacking,Multiplying {
    public DuckLive(String material) {
        super(material);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю в озере");
    }

    @Override
    public void multiply() {
        System.out.println("Нахожу пару на озере и строю утиную семью");
    }

    @Override
    public void quack() {
        System.out.println("Громко крякаю и привлекаю вторую половинку");
    }
}
