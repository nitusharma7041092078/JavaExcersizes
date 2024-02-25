import java.util.Scanner;

class RightTriangle
{
    public void pattern()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class LeftTriangle
{
    public void triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;
        /*for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--);
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        for(i=0;i<n;i++)
        {
            for(j=2*(n-i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

}
class Alphabets
{
    public void alphabet()
    {
        char i,j;
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}

class Pattern1
{
    public void pattern()
    {
        Scanner sc = new Scanner(System.in);
    }
}

public class Pattern {
    public static void main(String[] args)
    {
       // RightTriangle o = new RightTriangle();
        //o.pattern();

//        LeftTriangle o = new LeftTriangle();
//        o.triangle();

//        Alphabets a = new Alphabets();
//        a.alphabet();
    }
}
