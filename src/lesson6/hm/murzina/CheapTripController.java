package lesson6.hm.murzina;

import org.w3c.dom.ls.LSOutput;

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
            System.out.println("Введите название страны");
            String country = scanner.next();
            db.getToursByCountry(String.valueOf(country));
        } else if (choice == 3) {
            System.out.println("Введите название города");
            String city = scanner.next();
            db.getToursByCity(String.valueOf(city));
        } else if (choice == 4) {
            System.out.println("Введите ваш бюджет");
            int price = scanner.nextInt();
            db.getToursByPrice(price);
        } else if (choice == 5) {

        } else {
            System.out.println("К сожалению, такой функции еще нет. Выберите другой пункт меню.");
        }

    }
}
