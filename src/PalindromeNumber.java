import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        int n,result=0,r,q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        q=n;
        while(n!=0)
        {
            r=n%10;
            result=result*10+r;
            n=n/10;
        }

        if(q==result)
        {
            System.out.print("This number is palindrome");
        }
        else {
            System.out.print("This number is not palindrome");
        }
    }
}
