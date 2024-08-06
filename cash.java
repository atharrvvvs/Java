import java.util.Scanner;

public class cash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much cash do you have with you :");
        int cash = sc.nextInt();

        if(cash < 10)
        {
            System.out.println("You need more cash...!");
        }
        else if(cash > 10 && cash < 50)
        {
            System.out.println("You can buy  1 thing..!");
        }
        else
        {
            System.out.println("You can buy anything..!");
        }
    }
}