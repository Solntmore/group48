package lesson6.hm.murzina;

/**
 * База данных тура
 */
public class CheapTripDB {
    private final String[][] tours = new String[100][7];

    public CheapTripDB() {
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
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            String[] tour = tours[tourIndex];

            if (tour[0] == null) {
                return;
            }

            String tourCountry = tour[0];

            if (tourCountry.equalsIgnoreCase(country)) {
                for (int parameterIndex = 0; parameterIndex < tour.length; parameterIndex++) {
                    System.out.print(tour[parameterIndex] + " ");
                }
                System.out.println();
            }
        }
    }

    public void getToursByCity(String city) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            String[] tour = tours[tourIndex];

            if (tour[0] == null) {
                return;
            }

            String tourCity = tour[1];

            if (tourCity.equalsIgnoreCase(city)) {
                for (int parameterIndex = 0; parameterIndex < tour.length; parameterIndex++) {
                    System.out.print(tour[parameterIndex] + " ");
                }
                System.out.println();
            }
        }
    }
}

