import java.util.Scanner;

public class GuessesNumber {
    public static void main(String [] args)
    {
        String response = "";
        Scanner input= new Scanner(System.in);
        int x = (int) (Math.random() * 101);
        System.out.println("I am going to guess the number you are thinking of. My first guess is " + x);
        response = input.nextLine();
        while ( response.equals("higher") || response.equals("lower"))
        {
            if (response.equals("higher"))
            {
                x= x+1;
                System.out.println("Is it " + x);
                response= input.nextLine();
            }
            if (response.equals("lower"))
            {
                x= x-1;
                System.out.println("Is it " + x);
                response= input.nextLine();
            }

        }
        if (response.equals("correct"))
        {
            System.out.println("Yay I got it right! HEE HEE!");
        }
    }
}
