/**
 * Created by trina2 on 4/24/17.
 */
public class Rock extends Player {


    public Rock(String name) { //constructor from super class
        super(name);
    }

    @Override
    public String generateRoshambo() {

        return RPS.ROCK.toString();         //taking this in from our enum and will always return "rock"
    }

    @Override
    public String generateRoshambo(String userChoice) {
        return null;
    }
}
