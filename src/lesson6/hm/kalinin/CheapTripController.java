package lesson6.hm.kalinin;

import java.util.Scanner;

/**
 * Контроллер приложения
 */
public class CheapTripController {
    private CheapTripDB db = new CheapTripDB();

    public void start() {
        System.out.println("Добро пожаловать в Cheap Trip!");
        System.out.println("Я робот помощник Варвара");
        System.out.println("Я помогу выбрать вам тур по душе");
        System.out.println("Что Вы хотите посмотреть");
        System.out.println("1 - Просмотр всех туров");
        System.out.println("2 - Поиск туров по стране");
        System.out.println("3 - Поиск туров городу");
        System.out.println("4 - Поиск туров по цене");
        System.out.println("5 - Поиск по цене и по звездам одновременно");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            db.getAllTours();

        } else if (choice == 2) {
            System.out.println("Введите желаемую страну:");
            String country = scanner.next();
            db.getToursByCountry(country);

        } else if (choice == 3) {
            System.out.println("Введите желаемый город:");
            String city = scanner.next();
            db.getToursByCity(city);

        } else if (choice == 4) {
            System.out.println("Введите Ваш бюджет:");
            int price = scanner.nextInt();
            db.getToursByPrice(price);

        } else if (choice == 5) {
            System.out.println("Введите Ваш бюджет:");
            int price = scanner.nextInt();
            System.out.println("Ввведите количество звёзд отеля (1-5):");
            int stars = scanner.nextInt();
            db.getToursByPriceAndStars(price, stars);

        } else {
            System.out.println("К сожалению, такой функции нет. Выберите другой пункт меню");
        }
    }
}
