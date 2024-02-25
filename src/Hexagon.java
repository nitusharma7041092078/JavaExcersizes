//Write a Java program to compute hexagon area. formula Area = 6s^2/4 tan(PI/6)
//s = sides
import java.util.Scanner;
public class Hexagon {

    public double hexa(Double s )
    {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of hexagon : ");
        Double s = sc.nextDouble();
        Hexagon h = new Hexagon();
        System.out.println("Area of Hexagon : " + h.hexa(s));
    }
}
