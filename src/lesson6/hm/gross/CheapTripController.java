package lesson6.hm.gross;

import java.util.Scanner;

/**
 * Контроллер приложения
 */
public class CheapTripController {
    private CheapTripDB db = new CheapTripDB();

    public void start() {
        System.out.println("Добро пожаловать в CheapTrip!");
        System.out.println("Я робот-помощник Варвара.");
        System.out.println("Я помогу выбрать Вам тур по душе.");
        System.out.println("Что вы хотите посмотреть");
        System.out.println("1 - Просмотр всех туров");
        System.out.println("2 - Поиск тура по стране");
        System.out.println("3 - Поиск тура по городу");
        System.out.println("4 - Поиск тура по цене");
        System.out.println("5 - Поиск тура по цене и звездам одновременно");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            db.getAllTours();
        } else if (choice == 2) {
            System.out.println("Введите название страны:");
            String country = scanner.next();
            db.getToursByCountry(country);
        } else if (choice == 3) {
            System.out.println("Введите название города, в котором хотели бы побывать:");
            String city = scanner.next();
            db.getToursByCity(city);
        } else if (choice == 4) {
            System.out.println("Введите Ваш бюджет:");
            int price = scanner.nextInt();
            db.getToursByPrice(price);
        } else if (choice == 5) {

        } else {
            System.out.println("К сожалению такой функции еще нет. Выберете другой пункт в меню");
        }

    }
}
