/**
 * Created by trina2 on 4/24/17.
 */
public enum RPS {
    ROCK, PAPER, SCISSORS;

    public static RPS getRandom() {
        return values ()[(int) (Math.random() * values().length)]; //random method for enums
    }
}
