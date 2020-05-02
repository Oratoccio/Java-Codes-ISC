//A program to perform Binary search by using Recursive Function
import java.util.*;
public class Search
{
    public static int bsearch(int x[],int l,int h,int ele,int f)
    {
       int mid;
       mid=(l+h)/2;
       if(l>h||f==1)
         return(f);
       else
       {
           if(ele==x[mid])
              f=1;
           if(ele<x[mid])
              h=mid-1;
           if(ele>x[mid])
              l=mid+1;
           return(bsearch(x,l,h,ele,f));
       }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
        System.out.println("Enter element to be searched");
        int k=sc.nextInt();
        int l=0,h=n-1;
        int f=0;
        int res=bsearch(a,l,h,k,f);
        if(res==1)
            System.out.println("Element is found");
        else
            System.out.println("Element is not found");
    }
}
