package in.reinventing.classworkpattern.internalpatterns;
import java.util.Scanner;

class test
{
    private int n;
    public void setdata(int n)
    {

        this.n=n;
    }
    public void getdata()
    {
        System.out.println("n = "+n);
    }

}


public class ThisKeywordUse {

    public static void main(String[] args)
    {
        test t = new test();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        t.setdata(n);
        t.getdata();

    }

}
