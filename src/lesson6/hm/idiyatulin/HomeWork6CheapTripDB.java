package lesson6.hm.idiyatulin;

/**
 * База данных тура
 */
public class HomeWork6CheapTripDB {
    private String[][] tours = new String[100][7];

    public HomeWork6CheapTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100_000, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150_000, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150_000, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70000, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 135_000, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78000, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80000, 4, "завтрак");
        addTour("Шри-ланка", "Коломбо", "Самолет", 10, 200_000, 5, "все включено");
    }

    public void addTour(String country, String city, String transport, int days, int price, int stars, String food) {
        for (int index = 0; index < tours.length; index++) {
            if (tours[index][0] == null) {
                tours[index][0] = country;
                tours[index][1] = city;
                tours[index][2] = transport;
                tours[index][3] = String.valueOf(days);
                tours[index][4] = String.valueOf(price);
                tours[index][5] = String.valueOf(stars);
                tours[index][6] = food;

                return;
            }
        }
    }

    public void getAllTours() {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            String[] tour = tours[tourIndex];

            if (tour[0] == null) {
                return;
            }

            for (int parameterIndex = 0; parameterIndex < tour.length; parameterIndex++) {
                System.out.print(tour[parameterIndex] + " ");
            }
            System.out.println();
        }
    }

    public void getToursByPrice(int price) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            String[] tour = tours[tourIndex];

            if (tour[0] == null) {
                return;
            }

            String tourPrice = tour[4];
            //Integer.parseInt() - приведение к int,
            // по аналогии с String.valueOf() - приведение к String
            int tourPriceInt = Integer.parseInt(tourPrice);

            if (tourPriceInt <= price) {
                for (int parameterIndex = 0; parameterIndex < tour.length; parameterIndex++) {
                    System.out.print(tour[parameterIndex] + " ");
                }
                System.out.println();
            }
        }
    }

    public void getToursByCountry(String country) {
        boolean found = false;
        System.out.println("Туры в страну: " + country);

        if (tours != null && tours.length > 0) {
            for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
                String[] tour = tours[tourIndex];

                if (tours[tourIndex][0] != null && tours[tourIndex][0].equalsIgnoreCase(country)) {
                    System.out.println("Страна: " + tour[0] +
                        ", Город: " + tour[1] +
                        ", Транспорт: " + tour[2] +
                        ", Дней: " + tour[3] +
                        ", Цена: " + tour[4] +
                        ", Звезды: " + tour[5] +
                        ", Питание: " + tour[6]);
                    found = true;
                }

                //if (!found) {
                  //  System.out.println("Туры в данную страну не найдены");

            }
        }
    }

    public void getToursByCity(String city) {
        boolean found = false;
        System.out.println("Туры в город: " + city);

        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            String[] tour = tours[tourIndex];

            if (tours[tourIndex][1] != null && tours[tourIndex][1].equalsIgnoreCase(city)) {
                System.out.println("Страна: " + tour[0] +
                        ", Город: " + tour[1] +
                        ", Транспорт: " + tour[2] +
                        ", Дней: " + tour[3] +
                        ", Цена: " + tour[4] +
                        ", Звезды: " + tour[5] +
                        ", Питание: " + tour[6]);
                found = true;
            }

            //if (!found) {
              //  System.out.println("Туры в данный город не найдены");

        }
    }
}
/**
 * не смог пока победить вывод в консоль с функцией if (!found) {
 *                                                  System.out.println("Туры в данный город не найдены");
 *
 *
 */
