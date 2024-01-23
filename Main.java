import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Number = (int) (Math.random()*100);
        int UserInput = 0;
        do {
            System.out.println("Guess the number between 1 to 100");
            UserInput = sc.nextInt();
            if (UserInput == Number)
            {
                System.out.println("Bingoo! You guess right");
                break;
            } else if (UserInput > Number)
            {
                System.out.println("Your number is much greater than number");
            }
            else {
                System.out.println("Your number is much smaller");
            }
        }while (UserInput >= 0);
        System.out.println("My number was : ");
        System.out.println(Number);
    }
}