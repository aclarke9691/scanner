import java.util.Scanner;

public class guessANumber {
    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);
        int x= (int) (Math.random() * 101) ;
        System.out.println("I am thinking of a number between 1-100. Guess it hehehehe.");
        int number = input.nextInt();
        while (x!= number)
        {
            if (number>x)
            {
                System.out.println("Guess lower hehe");
                number= input.nextInt();
            }
            else
            {
                System.out.println("Guess higher hehe");
                number= input.nextInt();
            }

        }
        if (x == number)
        {
            System.out.println("You guessed it! HEE HEE!");
        }


    }
}
