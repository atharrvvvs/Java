import java.util.*;

public class sumOfnumbers
{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt();
    System.out.println("Enter no for addition");
    int sum=0;

    for(int i=0;i<=n;i++)
    { 
        sum = sum+1;
    }
    System.out.print(sum);
    }
}