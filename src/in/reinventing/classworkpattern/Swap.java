package in.reinventing.classworkpattern;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int temp=0;
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping ... ");
        System.out.println("value of a : "+a);
        System.out.print("value of b : "+b);

    }
}
