import java.util.*;
import Enums.PlayerType;
import Enums.Symbol;

public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private int position;

//    constructor
    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.position = 1;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int playTurn(Dice dice, Scanner sc) {
        if(playerType == playerType.HUMAN) {
            System.out.println();
            System.out.println(name + ", press Enter to roll the dice..");
            sc.nextLine();
        }
        else {
            System.out.println();
            System.out.println(name + " (Bot) is rolling..");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
//            sc.nextLine();
            System.out.println();
        }

        return dice.throwDie();
    }
}
