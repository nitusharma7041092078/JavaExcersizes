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
//        P1 obj1 = new P1();
//        obj1.p1();

//        P2 obj2 = new P2();
//        obj2.p2();

//        P3 obj3 = new P3();
//        obj3.p3();

//        P4 obj4 = new P4();
//        obj4.p4();


//        P5 obj5 = new P5();
//        obj5.p5();

//        P6 obj6 = new P6();
//        obj6.p6();


//        P8 obj8 = new P8();
//        obj8.p8();

//        P9 obj9 = new P9();
//        obj9.p9();

//        P10 obj10 = new P10();
//        obj10.p10();

        P11 obj11 = new P11();
        obj11.p11();
    }
}
