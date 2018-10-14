import java.util.Scanner;

public class GuessesNumber {
    public static void main(String [] args)
    {
        String response = "";
        Scanner input= new Scanner(System.in);
        //int x = (int) (Math.random() * 101);
        int x= 50;
        int y=25;
        System.out.println("I am going to guess the number you are thinking of. My first guess is " + x);
        response = input.nextLine();
        while ( response.equals("higher") || response.equals("lower"))
        {
            if (response.equals("higher"))
            {
                x= x+y;
                System.out.println("Is it " + x + "?");
                response= input.nextLine();
                y=15;
                x=x+y;
                System.out.println("Is it " + x + "?");
                response= input.nextLine();
                y=10;
                x=x+y;
                System.out.println("Is it " + x + "?");
                response= input.nextLine();
                y=5;
                x=x+y;
                while(x<=100 && response.equals("higher")) {
                    System.out.println("Is it " + x + "?");
                    response= input.nextLine();
                    y = 1;
                    x = x + y;
                }
            }
            if (response.equals("lower"))
            {
                x= x-y;
                System.out.println("Is it " + x + "?");
                response= input.nextLine();
                y=y-1;
            }

        }
        if (response.equals("correct"))
        {
            System.out.println("Yay I got it right! HEE HEE!");
        }
    }
}
