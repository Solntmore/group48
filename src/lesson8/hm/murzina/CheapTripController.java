package lesson8.hm.murzina;

import java.util.Scanner;

/**
 * Контроллер приложения
 */
public class CheapTripController {
    private CheapTripDB db = new CheapTripDB();

    public void start() {
        System.out.println("Добро пожаловать в CheapTrip!");
        System.out.println("Я робот-помощник Варвара.");
        System.out.println("Я помогу выбрать вам тур по душе.");
        System.out.println("Что вы хотите посмотреть?");
        System.out.println("1 - Просмотр всех туров");
        System.out.println("2 - Поиск туров по стране");
        System.out.println("3 - Поиск туров по городу");
        System.out.println("4 - Поиск туров по цене");
        System.out.println("5 - Поиск по цене и по звездам одновременно");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            db.getAllTours();
        } else if (choice == 2) {
            System.out.println("Введите страну для поиска туров");
            String country = scanner.next();
            db.getToursByCountry(String.valueOf(country));
        } else if (choice == 3) {
            System.out.println("Введите город для поиска туров");
            String city = scanner.next();
            db.getToursByCity(String.valueOf(city));
        } else if (choice == 4) {
            System.out.println("Введите максимальную цену для поиска туров");
            int price = scanner.nextInt();
            db.getToursByPrice(price);
        } else if (choice == 5) {
            System.out.println("Введите максимальную цену для поиска туров");
            int price = scanner.nextInt();
            System.out.println("Введите минимальное количество звезд для поиска туров");
            int stars = scanner.nextInt();
            db.getToursByPriceAndStars(price, stars);

        } else {
            System.out.println("К сожалению, такой функции еще нет. Выберите другой пункт меню.");
        }

    }
}
