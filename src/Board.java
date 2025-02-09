import java.util.*;

public class Board {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;

//    Constructor
    public Board(int size) {
        this.size = size;
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        initializeSnakesAndLadders();
    }

    private void initializeSnakesAndLadders() {
        snakes.add(new Snake(16, 6));
        snakes.add(new Snake(47, 26));
        snakes.add(new Snake(69, 11));

        ladders.add(new Ladder(22, 3));
        ladders.add(new Ladder(30, 18));
        ladders.add(new Ladder(64, 45));
    }

    public int getSize() {
        return size;
    }

    public int movePlayer(int position, int diceRoll) {
        int newPosition = position + diceRoll;

        if(newPosition > size) {
            System.out.println("Move exceeds board limit! Staying at " + position);
            return position;
        }

        for(Snake snake: snakes) {
            if(snake.getHead() == newPosition) {
                System.out.println("🐍 Bitten by a snake! Moving from " + newPosition + " to " + snake.getTail());
                return snake.getTail();
            }
        }

        for(Ladder ladder : ladders) {
            if(ladder.getBottom() == newPosition) {
                System.out.println("🪜 Climbed a ladder! Moving from " + newPosition + " to " + ladder.getTop());
                return ladder.getTop();
            }
        }

        return newPosition;
    }
}
