import java.util.*;

public class Dice {
    private static final int LIMIT = 6;

    public int throwDie() {
        return new Random().nextInt(LIMIT)+1;
    }
}
