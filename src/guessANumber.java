import java.util.Scanner;

public class guessANumber {
    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);
        int x= (int) (Math.random() * 101) ;
        String name= "";
        System.out.println("What is your name?");
        name= input.nextLine();
        System.out.println("Hello, " + name+ ". I am thinking of a number between 1-100. Guess it.");
        int number = input.nextInt();
        while (x!= number)
        {
            if (number>x)
            {
                System.out.println("Guess lower, " + name + ".");
                number= input.nextInt();
            }
            else
            {
                System.out.println("Guess higher, " + name + ".");
                number= input.nextInt();
            }

        }
        if (x == number)
        {
            System.out.println("You guessed it " + name + "!");
        }


    }
}
