import java.util.Scanner;

public class GuessesNumber {
    public static void main(String [] args) {
        String response = "";
        Scanner input = new Scanner(System.in);
        //int x = (int) (Math.random() * 101);
        int x = 50;
        int y= 20;
        int z= 20;
        System.out.println("I am going to guess the number you are thinking of. My first guess is " + x);
        response = input.nextLine();
        while (response.equals("higher") || response.equals("lower"))
        {
            while (response.equals("higher") && x<=100 && y!=0) {
                x = x + y;
                System.out.println("Is it " + x + "?");
                response = input.nextLine();
                y = y - 5;
            }
                while (y == 0 && response.equals("higher"))
                {
                    x=x+1;
                    System.out.println("Is it " + x + "?");
                    response= input.nextLine();
                }


            while (response.equals("lower") && x>=0 && z!=0) {
                x = x - z;
                System.out.println("Is it " + x + "?");
                response = input.nextLine();
                z = z - 5;
            }
                while (z == 0 && response.equals("lower"))
                {
                    x=x-1;
                    System.out.println("Is it " + x + "?");
                    response= input.nextLine();
                }


            }
            if (response.equals("correct")) {
                System.out.println("Yay I got it right!");
            }
        }
    }


