//Program to print the sum of a given series
import java.util.*;
public class MySeries
{
    int x,n,p,fac;
    MySeries()
    {
        x=n=p=0;
        fac=1;
    }
    void getnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ?");
        n=sc.nextInt();
        System.out.println("Enter the value of x ?");
        x=sc.nextInt();
    }
    int getpower(int g,int h)
    {
        if(h!=0)
           return g*getpower(g,h-1);
        else
           return 1;
    }
    int findFact(int y)
    {
        if(y!=0)
            return y*findFact(y-1);
        else
            return 1;
    }
    long findsum()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i*getpower(x,p+=2)/(fac=findFact(i));
        return sum;
    }
}
