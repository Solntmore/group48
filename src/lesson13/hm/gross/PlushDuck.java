package lesson13.hm.gross;

import java.util.Objects;

public class PlushDuck extends Duck implements Swimming, Quacking {
    private boolean waterproofness;

    public PlushDuck(String name, String color, boolean waterproofness) {
        super(name, color);
        this.waterproofness = waterproofness;
    }

    @Override
    public void toRest() {
        System.out.println("Отдыхает на кровати у хозяйки");
    }

    @Override
    public void swim() {
        if (waterproofness) {
            System.out.println("Плавает в емкостях с водой и издает смешные звуки");
        } else {
            System.out.println("Плавает, но не долго. Идет ко дну, когда совсем промокнет");
        }
    }

    @Override
    public void quack() {
        System.out.println("Крякает при нажатии на брюшко, так как в неё встроено специально устройство");
    }

    public boolean isWaterproofness() {
        return waterproofness;
    }

    public void setWaterproofness(boolean waterproofness) {
        this.waterproofness = waterproofness;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlushDuck plushDuck = (PlushDuck) o;
        return waterproofness == plushDuck.waterproofness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), waterproofness);
    }

    @Override
    public String toString() {
        return "Плюшевая утка. " +
                "Водонепроницаемость: " + waterproofness;
    }
}
