package in.reinventing.classworkpattern;
import java.util.Scanner;
public class ConvertNumberIntoWord {

    public static void word(int n,String s)
    {
        String one[] = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine",
                " ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen",
                " eighteen"," nineteen"};

        String ten[] = {"",""," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};

        if(n>19)
        {
            System.out.print(ten[n/10]+" "+one[n%10]+s);
        }
        else
        {
            if(n>0)
            {
                System.out.print(one[n]+" "+s);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");

        int value = sc.nextInt();
        word(value/10000000,"crore");
        value = value%10000000;
        word(value/100000,"lack");
        value = value%100000;
        word(value/1000,"thousand");
        value= value%1000;
        word(value/100,"hundred");
        value= value%100;
        word(value,"");

    }

}
