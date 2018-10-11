import java.util.Scanner;

public class guessANumber {
    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);
        int x= (int) Math.random() *11 + 100;
        System.out.println("I am thinking of a number between 1-100. Guess it hehehehe.");
        int number = input.nextInt();
        while (x!= number)
        {
            if (number>x)
            {
                System.out.println("Guess lower hehe");
            }
            else
            {
                System.out.println("Guess higher hehe");
            }

        }


    }
}
