package lesson10.hm.idiyatullin.kalinin;

import java.util.Scanner;

public class Blackjack {
    private Player[] players;

    public void start(int playersQuantity) {
        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество игроков менее 6 человек.");
            return;
        }

        players = new Player[playersQuantity];
        Scanner scanner = new Scanner(System.in);

        for (int playerIndex = 0; playerIndex < playersQuantity; playerIndex++) {
            System.out.println("\nВведите имя игрока " + (playerIndex + 1) + ":");
            String playerName = scanner.next();

            Player player = new Player(playerName);
            addPlayer(player);
        }
    }

    public void addPlayer(Player player) {
        for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
            if (players[playerIndex] == null) {
                players[playerIndex] = player;
                System.out.println("\nИгрок " + player.getName() + " присоединился к игре");
                break;
            }
        }
    }
}

