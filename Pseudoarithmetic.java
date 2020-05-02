//Program to check for pseudoarithmetic sequence
import java.util.*;
public class Pseudoarithmetic
{
    static Scanner sc=new Scanner(System.in);
    int n,sum,r;
    boolean ans,flag;
    int a[];
    public Pseudoarithmetic()
    {
        ans=true;
        flag=true;
    }
    public void accept(int nn)
    {
        n=nn;
        a=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    public boolean check()
    {
        r=a[0]+a[n-1];
        if(n%2==0)
        {
            for(int i=0;i<n/2;i++)
            {
                if(a[i]+a[n-1-i]!=r)
                   flag=false;
            }
        }
        else
        {
            for(int j=0;j<=n/2;j++)
            {
                if((a[j]+a[n-1-j])!=r)
                   ans=false;
            }
        }
        if(flag==true)
           sum=n/2*r;
        if(ans=true)
           sum=(n/2+1)*r;
        if(ans==false||flag==false)
           return false;
        else return true;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the size of sequence:");
        int nn=sc.nextInt();
        Pseudoarithmetic x=new Pseudoarithmetic();
        x.accept(nn);
        if(x.check())
            System.out.println("It is a Pseudoarithmetic sequence");
        else
            System.out.println("It is not a Pseudoarithmetic sequence");
    }
}