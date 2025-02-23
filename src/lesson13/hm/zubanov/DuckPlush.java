package lesson13.hm.zubanov;

public class DuckPlush extends Duck implements Quacking {
    public DuckPlush(String material) {
        super(material);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю по воображаемой воде");
    }

    @Override
    public void quack() {
        System.out.println("Крякаю при нажатии кнопки на туловище");
    }
}
