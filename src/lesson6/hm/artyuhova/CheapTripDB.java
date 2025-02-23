package lesson6.hm.artyuhova;

/**
 * База данных тура
 */
public class CheapTripDB {
    private String[][] tours = new String[100][7];

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
        for (String[] tour : tours) {
            if (tour[0] == null) break;
            for (String param : tour) {
                System.out.print(param + " ");
            }
            System.out.println();
        }
    }

    public void getToursByPrice(int price) {
        for (String[] tour : tours) {
            if (tour[0] == null) break;
            int tourPrice = Integer.parseInt(tour[4]);
            if (tourPrice <= price) {
                for (String param : tour) {
                    System.out.print(param + " ");
                }
                System.out.println();
            }
        }
    }

    // Новые методы
    public void getToursByCountry(String country) {
        for (String[] tour : tours) {
            if (tour[0] == null) break;
            if (tour[0].equalsIgnoreCase(country)) {
                for (String param : tour) {
                    System.out.print(param + " ");
                }
                System.out.println();
            }
        }
    }

    public void getToursByCity(String city) {
        for (String[] tour : tours) {
            if (tour[0] == null) break;
            if (tour[1].equalsIgnoreCase(city)) {
                for (String param : tour) {
                    System.out.print(param + " ");
                }
                System.out.println();
            }
        }
    }

    public void getToursByPriceAndStars(int price, int stars) {
        for (String[] tour : tours) {
            if (tour[0] == null) break;
            int tourPrice = Integer.parseInt(tour[4]);
            int tourStars = Integer.parseInt(tour[5]);
            if (tourPrice <= price && tourStars == stars) {
                for (String param : tour) {
                    System.out.print(param + " ");
                }
                System.out.println();
            }
        }
    }
}