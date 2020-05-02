//Program to find Smith numbers up to a limit given by the user
import java.util.*;
public class Smith_No
{
    public int sum(int a)
    {
        int d,s2=0;
        while(a>0)
        {
            d=a%10;
            s2=s2+d;
            a=a/10;
        }
        return(s2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s1=0,i,n1,c=0,j,s=0;
        System.out.println("Enter the limit to get all Smith numbers:");
        n=sc.nextInt();
        Smith_No ob=new Smith_No();
        for(j=1;j<=n;j++)
        {
            s1=0;
            s=0;
            s1=ob.sum(j);
            n1=j;
            i=2;
            while(n1>1)
            {
                if(n1%i==0)
                {
                    n1=n1/i;
                    s=s+ob.sum(i);
                }
                else
                    i++;
            }
            if(s1==s)
                System.out.println("Smith number:\t"+j);
        }
    }
}
