package lesson13.hm.gross;

public class RubberDuck extends Duck implements Swimming {
    public RubberDuck(String name, String color) {
        super(name, color);
    }

    @Override
    public void toRest() {
        System.out.println("Отдыхает на полке в ванной, в ожидании следующего заплыва");
    }

    @Override
    public void swim() {
        System.out.println("Плавает в ванной, когда купают ребенка");
    }

    @Override
    public String toString() {
        return "Резиновая утка";
    }
}
