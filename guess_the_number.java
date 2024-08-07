import java.util.Scanner;

public class guess_the_number
{
    public static void main (String args[])
    {
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;

        do
        {
            System.out.println("Guess no from 1 to 100");
             userNumber = sc.nextInt();

            if(userNumber == myNumber)
            {
                System.out.println("Yaa you guessed it right..!");
            }

            else if(userNumber > myNumber)
            {
                System.out.println("Gussed no is Large");
            }

            else
            {
                System.out.println("Gussed no is Small");
            }

        }
        while(userNumber >= 0);
        {
            System.out.println("My number was : ");
            System.out.println(myNumber);
        }

    }
}