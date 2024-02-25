import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=0;i<=n;i++)
        {
            for(k=n;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
