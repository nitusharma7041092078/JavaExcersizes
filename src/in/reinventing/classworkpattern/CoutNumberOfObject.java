package in.reinventing.classworkpattern;

class Box
{
    int length,width,height;
    static int count=0;

   Box()
    {
        length=10;
        width=10;
        height=10;
        Box.count_instances();
    }
    Box(int l,int w,int h)
    {
        length=l;
        width=w;
        height=h;
    }

    static void count_instances()
    {
        count++;
    }

}

public class CoutNumberOfObject {
    public static void main(String[] args)
    {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        System.out.println("No of object : "+Box.count);
    }
}
