package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class NumberPattern {
    public void p9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j,x=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=x;j++)
            {
                System.out.print(" "+j);
            }
            if(i<=n/3)
            {
                x+=2;

            }
            else
            {
                x-=2;
            }
            System.out.println();
        }
    }
}
