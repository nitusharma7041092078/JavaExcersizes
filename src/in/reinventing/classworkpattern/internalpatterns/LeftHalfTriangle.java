package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class LeftHalfTriangle {
    public void p3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;

        for(i=1;i<=n;i++)
        {
            for(j=2*n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
