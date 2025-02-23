package lesson7.hm.kalinin;

//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {
        Animals lion1 = new Animals("лев Лео", "Рыжий", 4);
        Animals lion2 = new Animals("лев Лео", "Рыжий", 4);
        Animals monkey = new Animals("обезьяна Мистер Бин", "Чёрный", 4);

        lion1.setHeight(1);
        lion1.setWeight(320);
        lion1.setLikeFood("мясо антилопы");

        lion2.setHeight(1);
        lion2.setWeight(320);
        lion2.setLikeFood("мясо жирафа");

        monkey.setHeight(2);
        monkey.setWeight(150);
        monkey.setLikeFood("бананы");

        System.out.println("\nНаши животные хотят представиться:");
        lion1.introduce();
        lion2.introduce();
        monkey.introduce();

        System.out.println("\nСравнение животных:");
        System.out.println("\nльвы близнецы? " + lion1.equals(lion2));
        System.out.println("\nльвы и обезьяна близнецы? " + lion1.equals(monkey));

        System.out.println("\nПрименение геттеров:");
        System.out.println("\n" + lion1.getName() + " " + lion1.getHeight() + " " + lion1.getWeight() + " " +
                lion1.getColor() + " " + lion1.getQuantityOfPaws() + " " + lion1.getLikeFood());
        System.out.println("\n" + lion2.getName() + " " + lion2.getHeight() + " " + lion2.getWeight() + " " +
                lion2.getColor() + " " + lion2.getQuantityOfPaws() + " " + lion2.getLikeFood());
        System.out.println("\n" + monkey.getName() + " " + monkey.getHeight() + " " + monkey.getWeight() + " " +
                monkey.getColor() + " " + monkey.getQuantityOfPaws() + " " + monkey.getLikeFood());

        System.out.println("\nПрименение метода toString():");
        System.out.println("\n" + lion1.toString());
        System.out.println("\n" + lion2.toString());
        System.out.println("\n" + monkey.toString());
    }
}