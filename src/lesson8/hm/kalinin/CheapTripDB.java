package lesson8.hm.kalinin;

public class CheapTripDB {

    /**
     * База данных тура
     */
    private Tour[] tours = new Tour[100];

    public CheapTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100_000, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150_000, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150_000, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70_000, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 135_000, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78_000, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80_000, 4, "завтрак");
        addTour("Шри-Ланка", "Коломбо", "Самолет", 10, 200_000, 5, "все включено");
    }

    public void addTour(String country, String city, String transport, int days, int price, int stars, String food) {
        Tour tour = new Tour(country, city, transport, days, price, stars, food);

        for (int index = 0; index < tours.length; index++) {
            if (tours[index] == null) {
                tours[index] = tour;
                return;
            }
        }
    }

    public void getAllTours() {
        for (Tour tour : tours) { //стандартный цикл for заменили на улучшенный (визуально более короткий) цикл for
            if (tour == null) {
                return;
            }
            System.out.println("\n" + tour);
        }
    }

    public void getToursByPrice(int price) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if (tour.getPrice() <= price) {
                System.out.println("\n" + tour);
            }
        }
    }

    public void getToursByCountry(String country) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if (tour.getCountry().equalsIgnoreCase(country)) {
                System.out.println("\n" + tour);
            }
        }
    }

    public void getToursByCity(String city) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if (tour.getCity().equalsIgnoreCase(city)) {
                System.out.println("\n" + tour);
            }
        }
    }

    public void getToursByPriceAndStars(int price, int stars) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if (tour.getPrice() <= price && tour.getStars() >= stars) {
                System.out.println("\n" + tour);
            }
        }
    }
}

