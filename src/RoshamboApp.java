import java.util.Scanner;

/**
 * Created by trina2 on 4/24/17.
 */
public class RoshamboApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String playAgain = ""; //initializing play again so we can user it later

        System.out.println("Welcome to Rock, Paper, Scissors! ");

        System.out.println("Please enter your name: ");
        String userName = scnr.nextLine();

        Human player1 =  new Human(userName); //player1 is human
        Computer player2 = new Computer("Hermione"); //passing thru hermione
        Rock player3 = new Rock("Ron");

        System.out.println("Would you like to play against Hermione, or Ron (h/r)? ");
        String userChoice = scnr.nextLine();
        userChoice.toLowerCase(); //making hermiones choices lower case

        do { //do this crap first
            System.out.println("Rock, Paper, Scissors? ");
            String userInput = scnr.nextLine(); //input for rps


            if (userChoice.equalsIgnoreCase("h")) {
                String human = player1.generateRoshambo(userInput); //will be used for decideWinner method
                String hermione = player2.generateRoshambo();
                System.out.println(player1.getName() + " " + human); //human class + userinput
                System.out.println(player2.getName() + " " + hermione); //hermione/random class
            } else if (userChoice.equalsIgnoreCase("r")) {
                String ron = player3.generateRoshambo();
                String human = player1.generateRoshambo(userInput);
                System.out.println(player1.getName() + " " + human); //rock class + userinput
                System.out.println(player3.getName() + " " + ron); //ron/rock class

            }
            System.out.println("Play again? Type in 'yes' or 'no'. "); //asking if they want to play again
            playAgain = scnr.nextLine(); //taking in scaner input

        } while(playAgain.equalsIgnoreCase("yes"));  //closing do loop, opening whole loop
        System.out.println("Thanks for playing. Goodbye. ");
    }


}
