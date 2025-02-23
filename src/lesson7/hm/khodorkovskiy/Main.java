package lesson7.hm.khodorkovskiy;

public class Main {
    public static void main(String[] args) {
        //Создание животных
        Animal lion = new Animal(1.5, 150, "Лев Симба", "Белый", 4, "Мясо");
        Animal giraffe = new Animal(6.0, 200, "Жираф Бронко", "Желтый с коричневыми пятнами", 4, "Растения");
        Animal lion2 = new Animal(1.5, 150, "Лев Симба", "Белый", 4, "Мясо");

        //Вывод данных о животных
        System.out.println("Вывод данных о животных:");
        System.out.println("Первое животное: " + lion.toString());
        System.out.println("Второе животное: " + giraffe.toString());
        System.out.println("Третье животное: " + lion2.toString());

        //Изменение веса, роста и любимой еды
        giraffe.setHeight(8.0);
        giraffe.setWeight(300.0);
        giraffe.setFavoriteFood("манго");

        //Вывод измененных данных по животному
        System.out.println("\nВывод измененных данных по животному:");
        System.out.println("Теперь я такой: " + giraffe.toString());

        //Сравнение животных
        System.out.println("\nСравнение животных");
        System.out.println("Мы близнецы? - " + lion.equals(giraffe));
        System.out.println("Мы близнецы? - " + lion.equals(lion2));
        System.out.println("Мы близнецы? - " + lion2.equals(giraffe));


    }
}