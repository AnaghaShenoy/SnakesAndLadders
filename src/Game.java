import java.util.*;

public class Game {
    private Board board;
    private List<Player> players;
    private Dice dice;
    private Player winner;

//    constructor
    public Game(List<Player> players) {
        this.board = new Board(100);
        this.players = players;
        this.dice = new Dice();
        initializeGame();
    }

    private void initializeGame() {
        Collections.shuffle(players); // Randomizing first turn
        System.out.println("Game Started! First Player is: " + players.get(0).getName());
        System.out.println();
    }


    public void start(Scanner sc) {
        while(winner == null) {
            for(Player player : players) {
                playTurn(player, sc);
                if (winner != null) {
                    System.out.println("🎉 Winner is: " + winner.getName() + " 🎉");
                    return;
                }
            }
        }
    }

    private void playTurn(Player player, Scanner sc) {
        int diceRoll = player.playTurn(dice, sc);
        System.out.println(player.getName() + " rolled a " + diceRoll);

        int newPosition = board.movePlayer(player.getPosition(), diceRoll);
        player.setPosition(newPosition);
        System.out.println(player.getName() + " is at " + player.getPosition());

        if(newPosition == board.getSize()) {
            winner = player;
        }
    }


}
