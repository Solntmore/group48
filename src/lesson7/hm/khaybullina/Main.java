package lesson7.hm.khaybullina;

public class Main {
    public static void main(String[] args) {
        //Создаем 3-х животных (коты)
        Animal tom = new Animal("Том",25.0,7.5, "серого",4,"Роял Канин");
        Animal tomTwin = new Animal("Том",25.0,7.5, "серого",4,"Роял Канин");
        Animal martin = new Animal("Мартин",20.0,6.5,"рыжего",4,"Молоко");

        System.out.println("\nИспользуем свои методы для вывода информации о котах:" +
                "\nИнформация о Томе:");
        tom.sayName();
        tom.sayHeight();
        tom.sayWeight();
        tom.sayColor();
        tom.sayNumberOfPaws();
        tom.sayFavoriteFood();

        System.out.println("\nИнформация о близнеце Тома:");
        tomTwin.sayName();
        tomTwin.sayHeight();
        tomTwin.sayWeight();
        tomTwin.sayColor();
        tomTwin.sayNumberOfPaws();
        tomTwin.sayFavoriteFood();

        System.out.println("\nИнформация о Мартине: ");
        martin.sayName();
        martin.sayHeight();
        martin.sayWeight();
        martin.sayColor();
        martin.sayNumberOfPaws();
        martin.sayFavoriteFood();

        System.out.println("\nИзменим вес, рост и любимую еду Мартина с помощью сеттеров и выведем с помощью геттеров");
        martin.setWeight(7.0);
        martin.setHeight(22.0);
        martin.setFavoriteFood("Рыба");

        System.out.println("- Мой вес - " + martin.getWeight() + " кг;");
        System.out.println("- Мой рост - " + martin.getHeight() + " см;");
        System.out.println("- Моя любимая еда - " + martin.getFavoriteFood() + ".");

        System.out.println("\nПродемонстрируем сравнение животных с помощью equals:");
        System.out.println("Том и Том близнецы? " + " - " + tom.equals(tomTwin));
        System.out.println("Том и Мартин близнецы? " + " - " + tom.equals(martin));
    }
}
