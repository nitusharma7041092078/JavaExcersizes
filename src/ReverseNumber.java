import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        int n,r,reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        System.out.print("Reverse: "+reverse);
    }
}
