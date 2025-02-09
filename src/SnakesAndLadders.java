import Enums.PlayerType;
import Enums.Symbol;

import java.util.*;
import java.util.Scanner;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players (2-4): ");

        int numberOfPlayers = sc.nextInt();
        sc.nextLine();

        List<Player> players = new ArrayList<>();
        for(int i=0; i<numberOfPlayers; i++) {
            System.out.println("Enter player " + (i+1) + " name: ");
            String name = sc.nextLine();
//          Assigning a unique symbol
            Symbol symbol = Symbol.values()[i];
            players.add(new Player(name, symbol, i==(numberOfPlayers-1) ? PlayerType.BOT : PlayerType.HUMAN));
        }

        Game game = new Game(players);
        game.start(sc);

        sc.close();
    }
}
