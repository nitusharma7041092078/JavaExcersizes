package in.reinventing.classworkpattern;
import java.lang.*;
import java.util.*;
class MyException extends Exception
{
    public String toString()
    {
        return "Not Sufficient Fund.";
    }
}

class Account
{
    double amount;
    Account(double a)
    {
        amount = a;
    }
    void deposited(double a)
    {
        amount +=a;
        System.out.println(a+" rupees deposited.");
        System.out.println("New balance is : "+amount);
    }

    void withdraw(double a)
    {
        if((amount-a)<0)
        {
            System.out.println("Attempt to withdraw "+a+" rupees is failed.");
            try
            {
                throw new MyException();
            }
            catch (MyException e)
            {
                System.out.println(e);
            }
        }
        else
        {
            amount-=a;
            System.out.println(a+" rupees withdraw.");
            System.out.println("New balance is : "+amount);
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        a1.withdraw(400.00);
        a1.withdraw(300.00);
        a1.withdraw(500.00);
    }
}
