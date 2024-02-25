
import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        String s ="";
        int i;
        for(i=str.length()-1;i>=0;i--)
        {
            s = s+ch[i];
        }
        System.out.println("Reverse String : "+ s);
    }
}