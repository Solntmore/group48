package lesson7.hm.qambarova;

public class Main2 {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Собака", 1.2, 20,
                                    "Белый", 4, "Мясо");
        Animals animal2 = new Animals("Собака", 1.2, 20,
                                      "Белый", 4, "Мясо");
        Animals animal3 = new Animals("Кошка", 0.4, 10,
                                      "Серый", 4, "Молоко");


        System.out.println("\nПрименяем метод Getter для всех животных ");
        System.out.println(animal1.getName() + "  " + animal1.getHeight() + "  " + animal1.getWeight() + "  " +
                           animal1.getColor() + "  " + animal1.getCountOfPaws() + "  " + animal1.getFavoriteFood());

        System.out.println(animal2.getName() + "  " + animal2.getHeight() + "  " + animal2.getWeight() + "  " +
                           animal2.getColor() + "  " + animal2.getCountOfPaws() + "  " + animal2.getFavoriteFood());

        System.out.println(animal3.getName() + "  " + animal3.getHeight() + "  " + animal3.getWeight() + "  " +
                           animal3.getColor() + "  " + animal3.getCountOfPaws() + "  " + animal3.getFavoriteFood());


        System.out.println("\nГоворяшие животние: ");
        System.out.println("1 - животное говорить: ");
        animal1.speak();
        System.out.println("\n2 - животное говорить: ");
        animal2.speak();
        System.out.println("\n3 - животное говорить: ");
        animal3.speak();


        System.out.println("\nИсползование метод Setter для изменение данных 1-го животного");
        System.out.println("Поменяем Рост на 1.1, вес на 55 и любимая еда на рыбу");
        animal1.setHeight(1.1);
        animal1.setWeight(55.0);
        animal1.setFavoriteFood("Рыба");

        System.out.println("После изменений:");
        animal1.speak();

        System.out.println("\nСравнение животных с помщью equals() and hashCode()\n" + animal1.equals(animal2));

        System.out.println("\nПроверка на Близнецов 1 и 2-го животного");
        System.out.println(animal1.equals(animal2));

        System.out.println("\nПроверка на Близнецов 2 и 3-го животного");
        System.out.println(animal2.equals(animal3));

    }
}
