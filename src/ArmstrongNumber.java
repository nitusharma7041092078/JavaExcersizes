import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args)
    {
        int n,q,r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        q=n;
        while(n!=0)
        {
            r=n%10;
            rev+=Math.pow(r,3);
            n=n/10;
        }

        if(q==rev)
        {
            System.out.print("Armstrong ");
        }
        else
        {
            System.out.print("not Armstrong");
        }
    }
}
