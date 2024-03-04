package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class NumericRightHalfPyramid {
    public void p8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j,alpha=65;

        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=n-1-i;j++)
            {
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
    }
}
