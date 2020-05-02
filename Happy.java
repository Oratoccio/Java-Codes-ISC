//Program to check Happy number
import java.util.*;
public class Happy
{
    int n;
    Happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sq_digits(int x)
    {
        return (x<=0)?0:(x%10*x%10)+sum_sq_digits(x/10);
    }
    void isHappy()
    {
        int x=n;
        while(x>9)
            x=sum_sq_digits(x);
        if(x==1)
            System.out.println("\n"+n+" IS A HAPPY NUMBER");
        else
            System.out.println("\n"+n+" IS NOT A HAPPY NUMBER");
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter a number ");
        int a=sc.nextInt();
        Happy x=new Happy();
        x.getnum(a);
        x.isHappy();
    }
}
