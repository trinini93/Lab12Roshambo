/**
 * Created by trina2 on 4/24/17.
 */
public abstract class Player {

    String name;

    public Player(String getName) { //constructor
        this.name = getName;
    }

    public String getName() { //getters and setters
        return name;
    }

    public void setName(String getName) {
        this.name = getName;
    }

    public abstract String generateRoshambo(); //method to gen roshambo

    public abstract String generateRoshambo(String userChoice); //this is the method for taking in userInput


}
