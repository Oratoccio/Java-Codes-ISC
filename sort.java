//To perform Bubble sort and Binary Search in a set of integers
import java.util.*;
class sort
{
    int ar[]=new int[50];
    int n,i;
    void inputdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array to maximum 50 ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number ");
            ar[i]=sc.nextInt();
        }
    }
    void bubsort()
    {
        int j,temp;
        for(i=0;i<(n-1);i++)
        {
            for(j=0;j<(n-1);j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("The elements of the sorted array are: ");
        for(i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
    void binsearch()
    {
        int lb,ub,mid,found=0,item;
        lb=0;
        ub=n-1;
        mid=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched ");
        item=sc.nextInt();
        while(found==0&&lb!=ub)
        {
            mid=(lb+ub)/2;
            if(item<ar[mid])
              ub=mid;
            if(item>ar[mid])
              lb=mid;
            if(item==ar[mid])
              found=1;
        }
        if(found==1)
        {
            System.out.println("Search successful!!!");
            System.out.println("The number found at position: "+mid);
        }
        else
            System.out.println("Search not successful!!!");
    }
}
