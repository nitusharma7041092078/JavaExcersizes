package in.reinventing.classworkpattern;

 interface PONE
{
    int I = 1;
    void showI();
}
interface PTWO
{
    int J = 2;
    void showJ();
}
interface P12 extends PONE,PTWO
{
    int K = 3;
    void showK();
}

class Q implements P12
{
    public void showI()
    {
        System.out.println("I = "+I);
    }
    public void showJ()
    {
        System.out.println("J = "+J);
    }
    public void showK()
    {
        System.out.println("K = "+K);
    }
}
public class Example {
    public static void main(String[] args)
    {
        Q q1 = new Q();
        q1.showI();
        q1.showJ();
        q1.showK();

    }
}
