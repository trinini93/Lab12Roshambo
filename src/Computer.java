
/**
 * Created by trina2 on 4/24/17.
 */
public class Computer extends Player {

    public Computer(String name) { //constructor from player class to gen name
        super(name);
    }



    @Override
    public String generateRoshambo() {
        RPS randChoices = RPS.getRandom();

        return String.valueOf(randChoices);
    }

    @Override
    public String generateRoshambo(String userChoice) {
        return null;
    }
}
