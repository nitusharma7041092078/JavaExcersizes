package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class ReverseStarPyramidPattern {
    public void p6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
