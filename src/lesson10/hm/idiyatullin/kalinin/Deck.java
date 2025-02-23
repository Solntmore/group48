package lesson10.hm.idiyatullin.kalinin;

public class Deck {
    private Card[] cards = new Card[52];

    public Deck() {
        addCard("Двойка крести", 2);
        addCard("Двойка бубна", 2);
        addCard("Двойка пика", 2);
        addCard("Двойка черви", 2);

        addCard("Тройка крести", 3);
        addCard("Тройка бубна", 3);
        addCard("Тройка пика", 3);
        addCard("Тройка черви", 3);

        addCard("Четверка крести", 4);
        addCard("Четверка бубна", 4);
        addCard("Четверка пика", 4);
        addCard("Четверка черви", 4);

        addCard("Пятерка крести", 5);
        addCard("Пятерка бубна", 5);
        addCard("Пятерка пика", 5);
        addCard("Пятерка черви", 5);

        addCard("Шестёрка крести", 6);
        addCard("Шестёрка бубна", 6);
        addCard("Шестёрка пика", 6);
        addCard("Шестёрка черви", 6);

        addCard("Семёрка крести", 7);
        addCard("Семёрка бубна", 7);
        addCard("Семёрка пика", 7);
        addCard("Семёрка черви", 7);

        addCard("Восьмёрка крести", 8);
        addCard("Восьмёрка бубна", 8);
        addCard("Восьмёрка пика", 8);
        addCard("Восьмёрка черви", 8);

        addCard("Девятка крести", 9);
        addCard("Девятка бубна", 9);
        addCard("Девятка пика", 9);
        addCard("Девятка черви", 9);

        addCard("Десятый крести", 10);
        addCard("Десятый бубна", 10);
        addCard("Десятый пика", 10);
        addCard("Десятый черви", 10);

        addCard("Валет крести", 2);
        addCard("Валет бубна", 2);
        addCard("Валет пика", 2);
        addCard("Валет черви", 2);

        addCard("Дама крести", 3);
        addCard("Дама бубна", 3);
        addCard("Дама пика", 3);
        addCard("Дама черви", 3);

        addCard("Король крести", 4);
        addCard("Король бубна", 4);
        addCard("Король пика", 4);
        addCard("Король черви", 4);

        addCard("Туз крести", 11);

        addCard("Туз бубна", 11);
        addCard("Туз пика", 11);
        addCard("Туз черви", 11);
    }

    public Card getRandomCard() {
        return cards[(int) (Math.random() * cards.length)];
    }

    private void addCard(String suit, int nominal) {
        Card card = new Card(nominal, suit);

        for (int index = 0; index < cards.length; index++) {
            if (cards[index] == null) {
                cards[index] = card;
                return;
            }
        }
    }
}
