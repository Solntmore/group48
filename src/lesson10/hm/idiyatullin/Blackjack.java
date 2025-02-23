package lesson10.hm.idiyatullin;

import java.util.Scanner;

public class Blackjack {
    private Player[] players;
    private int currentPlayerCount = 0;

    public void start(int playersQuantity) {
        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество игроков менее 6 человек.");
            return;
        }

        players = new Player[playersQuantity];

        for (int playerIndex = 0; playerIndex < playersQuantity; playerIndex++) {
            System.out.println("Введите желаемое имя игрока " + (playerIndex + 1) + ":");
            Scanner scanner = new Scanner(System.in);
            String playerName = scanner.next();

            Player player = new Player(playerName);
            addPlayer(player);
        }
    }
    public void addPlayer(Player player) {              // ДЗ
        if (currentPlayerCount < players.length) {
            players[currentPlayerCount] = player;
            currentPlayerCount++;
            System.out.println("Игрок " + player + " добавлен.");
        }
        else {
            System.out.println("Невозможно добавить игрока. Максимальное количество игроков достигнуто.");
        }
    }
}
