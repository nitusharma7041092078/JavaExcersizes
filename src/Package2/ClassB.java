package Package2;
import Package1.*;
public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassB objA= new ClassB();
        System.out.println("n:"+objA.n);
        System.out.println("n_pub:"+objA.n_pub);

    }
}
