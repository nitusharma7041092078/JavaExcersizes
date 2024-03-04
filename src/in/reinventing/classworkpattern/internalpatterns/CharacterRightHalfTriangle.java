package in.reinventing.classworkpattern.internalpatterns;

import java.util.Scanner;

public class CharacterRightHalfTriangle {
    public void p4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j,alpha=65;

        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
    }
}
