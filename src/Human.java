/**
 * Created by trina2 on 4/24/17.
 */
public class Human extends Player {


    public Human(String name) {
        super(name);
    }

    @Override
    public String generateRoshambo() {
        return null;
    }

    @Override
    public String generateRoshambo(String userChoice) {
        String result = ""; //calling in all rps choices

        if(userChoice.equalsIgnoreCase(RPS.ROCK.toString())) {

            result = RPS.ROCK.toString();
        } else if (userChoice.equalsIgnoreCase(RPS.PAPER.toString())) {

            result = RPS.PAPER.toString();
        } else if (userChoice.equalsIgnoreCase(RPS.SCISSORS.toString())) {

            result = RPS.SCISSORS.toString();
        }
        return result;
    }
}
