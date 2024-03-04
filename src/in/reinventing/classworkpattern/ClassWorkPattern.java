package in.reinventing.classworkpattern;

import in.reinventing.classworkpattern.internalpatterns.*;

import java.util.Scanner;

class P1
{
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

class P2
{
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

 class P3
{
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


class P4
{
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


class P5
{
    public void p5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class P6
{
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

class P7
{
    public void p7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i ,j;

        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


class P8
{
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

class  P9
{
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

class P10
{
    public void p10()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class P11
{
    public void p11()
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i,j;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

public class ClassWorkPattern {
    public static void main(String[] args)
    {

        ReverseRightHalfPyramid rrhpp=new ReverseRightHalfPyramid();
        rrhpp.p1();

        RightHalfTriangle rht= new RightHalfTriangle();
        rht.p2();

        LeftHalfTriangle lht = new LeftHalfTriangle();
        lht.p3();

        CharacterRightHalfTriangle crht = new CharacterRightHalfTriangle();
        crht.p4();

        StarTrianglePattern stp = new StarTrianglePattern();
        stp.p5();

        ReverseStarPyramidPattern rspp = new ReverseStarPyramidPattern();
        rspp.p6();

        ReverseCharacterPyramid rcp = new ReverseCharacterPyramid();
        rcp.p7();

        NumericRightHalfPyramid nrhp = new NumericRightHalfPyramid();
        nrhp.p8();

        NumberPattern np = new NumberPattern();
        np.p9();

        RightHalfPyramid rhp = new RightHalfPyramid();
        rhp.p10();

        DiamondPattern dp = new DiamondPattern();
        dp.p11();

    }
}
