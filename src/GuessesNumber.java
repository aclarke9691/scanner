import java.util.Scanner;

public class GuessesNumber {
    public static void main(String [] args)
    {
        Scanner input= new Scanner(System.in);
        int x = (int) (Math.random() * 11);
        System.out.println("I am going to guess the number you are thinking of. My first guess is" + x);
        String response = input.nextLine();
        while ( response != "correct")
        {
            if (response == "higher")
            {
                System.out.println("Is it")
            }

        }
        if (response == "correct")
        {
            System.out.println("Yay I got it right! HEE HEE!");
        }
    }
}
