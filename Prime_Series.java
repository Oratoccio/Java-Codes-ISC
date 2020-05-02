//To print the primme numbers form a list of numbers
import java.util.*;
public class Prime_Series
{
    Scanner sc=new Scanner(System.in);
    int limit;
    int arr[]=new int[150];
    Prime_Series()
    {
        int i;
        for(i=0;i<150;i++)
        {
            arr[i]=0;
        }
    }
    void readList()
    {
        int j;
        System.out.println("Enter the number of elements to store");
        limit=sc.nextInt();
        System.out.println("Enter the elements");
        for(j=0;j<limit;j++)
        {
            arr[j]=sc.nextInt();
        }
    }
    int Isprime(int num, int j,int f)
    {
        if(j==num)
            return(f);
        else
        {
            if(num%j==0)
                f=0;
            return(Isprime(num,++j,f));
        }
    }
    void PrintPrime()
    {
        int v;
        for(int i=0;i<limit;i++)
        {
            v=Isprime(arr[i],2,1);
            if(v==1)
              System.out.println("No."+arr[i]+"is prime");
        }
    }
}
