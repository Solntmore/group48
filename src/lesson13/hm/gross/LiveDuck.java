package lesson13.hm.gross;

import java.util.Objects;

public class LiveDuck extends Duck implements Breeding, Swimming, Quacking, Flyable {
    private int age;

    public LiveDuck(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }

    @Override
    public void toRest() {
        System.out.println("Спит на берегу, с открытым глазом, засунув клюв под крыло");
    }

    @Override
    public void breed() {
        System.out.println("Период яйцекладки у диких уток начинается в весенний период. " +
                "Уже с мая по июль можно встретить утку с выводком пуховичков.");
    }

    @Override
    public void swim() {
        System.out.println("Плавает на поверхности воды, высматривая еду или охотников");
    }

    @Override
    public void fly() {
        System.out.println("Летает, чтобы скрыться от охотников");
    }

    @Override
    public void quack() {
        System.out.println("Крякает громко и пронзительно");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LiveDuck liveDuck = (LiveDuck) o;
        return age == liveDuck.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public String toString() {
        if (age == 1) {
            return "Живая утка. Возраст " + age + " год";
        } else if (age <= 4) {
            return "Живая утка. Возраст " + age + " года";
        } else {
            return "Живая утка. Возраст " + age + " лет";
        }
    }
}
