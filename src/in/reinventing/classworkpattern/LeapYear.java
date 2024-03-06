package in.reinventing.classworkpattern;

import java.util.Scanner;

class InputYear
{
    int year ;
    public void getyear()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        year = sc.nextInt();
    }
}

class OutputYear extends InputYear
{
    public void findleapyear() {

        if(year%4==0)
        {
            System.out.print(year+" is Leap year");
        }
        else
        {
            System.out.print(year+" is not a leap year");
        }
    }

}
public class LeapYear {
    public static void main(String[] args)
    {
        OutputYear obj = new OutputYear();
        obj.getyear();
        obj.findleapyear();
    }
}
