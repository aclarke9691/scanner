import java.util.Scanner;

public class main {
    public static void main(String [] args)
    {
        Scanner choice = new Scanner(System.in);
        int game = 0;
        System.out.println("Welcome. Would you like to guess the computer's secret number, or have the computer guess yours? Enter 1 for the first game, and 2 for the second.");
        game= choice.nextInt();
        if (game == 1)
        {
            GuessesNumber.main(String [] args);
        }
        if (game == 2)
        {
            guessANumber.main(String[] args);
        }

    }
}
