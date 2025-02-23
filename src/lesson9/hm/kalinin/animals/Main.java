package lesson9.hm.kalinin.animals;

//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Snake snake = new Snake();
        Fish fish = new Fish();

        Animal[] animals = {bird, snake, fish};
        for (Animal animal : animals) {
            animal.move();
            System.out.println();
        }
    }
}