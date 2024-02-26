import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        int m,n,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println("This is not prime number.");
            return;
        }
        else {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("This is not prime number.");
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0)
        {
            System.out.println("This is a prime number.");
        }
    }

}
