package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class ReverseRightHalfPyramid {
    public void p1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
