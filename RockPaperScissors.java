import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
    Random random = new Random();
    int computer = random.nextInt(3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice, 0 for Rock, 1 for Paper or 2 for Scissors");
        int player = sc.nextInt();

        String comp = "";

        if (computer == 0) {
             comp = "Rock";
        }
        else if (computer == 1) {
             comp = "Paper";
        }
        else if (computer == 2) {
             comp = "Scissors";
        }

        if (player == computer) {
            System.out.println("Computer entered " + comp + " and the game is a Tie");
        }
        else if ( (player==0 && computer==1) || (player==1 && computer==2) || (player==2 && computer==0)) {
            System.out.println("Computer entered " + comp + " and won" );
        }
        else if ((player==1 && computer==0) || (player==2 && computer==1) || (player==0 && computer==2)) {
            System.out.println("Computer entered " + comp + " and lost");
        }
    }
}
