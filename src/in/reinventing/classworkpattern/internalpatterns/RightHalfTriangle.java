package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class RightHalfTriangle {
    public void p2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
